package com.a3m.dao.impl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.a3m.dao.SmallLeadDao;
import com.a3m.domain.OfferPriceAndTMVDO;
import com.a3m.domain.SmallLeadDO;
import com.a3m.mapper.SmallLeadDOMapper;
import com.a3m.model.LeadCriteria;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SmallLeadDaoImpl implements SmallLeadDao {

	@Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    private final static String SELECT_SMALL_LEAD_BY_ID_SQL = 
    		"SELECT r.rf_edmunds_make"
            + ", r.rf_edmunds_model"
    		+ ", r.rf_edmunds_year"
    		+ ", l.ld_price_promise_flag"
    		+ ", r.rf_offer_price"
    		+ " FROM lead l, referral r "
    		+ " where l.ld_lead_id = r.rf_lead_id"
    		+ " and l.ld_lead_id = ?";
    
    private final RowMapper<SmallLeadDO> SMALL_LEAD_MAPPER = new SmallLeadDOMapper();

    private final static String SELECT_LEADS_COUNT_BY_CRYTERIA = 
    		"select count(*) as total"
    		+ " from lead l" +
               " INNER JOIN referral r" +
               " ON l.ld_lead_id = r.rf_lead_id"
               //     ", " // , f_carcode c"

          //  + " and c.partner_lead_id = l.ld_partner_lead_id"
            + " where  r.rf_edmunds_make = :vehicle_make"
         //  /*!*/ + " and  r.rf_edmunds_model = :rf_edmunds_model"
    		+ " and r.rf_edmunds_year between :vehicle_year_from and :vehicle_year_to"
            + " and r.rf_offer_price between :price_from and :price_to"
    		+ " and l.ld_price_promise_flag = :price_promise_flag";


    private final static String SELECT_SUCCESFUL_LEADS_COUNT_BY_CRYTERIA =
            "select count(DISTINCT s.lead_id) as total from sales s " +
                    "where s.lead_id IN (select l.ld_lead_id"
                    + " from lead l" +
                    " INNER JOIN referral r" +
                    " ON l.ld_lead_id = r.rf_lead_id"
                    //     ", " // , f_carcode c"

                    //  + " and c.partner_lead_id = l.ld_partner_lead_id"
                    + " where  r.rf_edmunds_make = :vehicle_make"
                    //  /*!*/ + " and  r.rf_edmunds_model = :rf_edmunds_model"
                    + " and r.rf_edmunds_year between :vehicle_year_from and :vehicle_year_to"
                    + " and r.rf_offer_price between :price_from and :price_to"
                    + " and l.ld_price_promise_flag = :price_promise_flag)";

//    private final static String SELECT_SUCCESFUL_LEADS_COUNT_BY_CRYTERIA =
//            "select count(*) as total"
//                    + " from lead l" +
//                      " INNER JOIN referral r "
//                   +  " ON l.ld_lead_id = r.rf_lead_id "
//                   + " INNER JOIN sales s"
//                   + " ON s.lead_id = r.rf_lead_id"
//                   + " where "
//                //    + " and r.rf_lead_id = s.lead_id"
//                    // + " and c.partner_lead_id = l.ld_partner_lead_id"
//                    + "  r.rf_edmunds_make = :vehicle_make"
//                    //  /*!*/  + " and  r.rf_edmunds_model = :rf_edmunds_model"
//                    + " and r.rf_edmunds_year between :vehicle_year_from and :vehicle_year_to"
//                    + " and r.rf_offer_price between :price_from and :price_to"
//                    + " and l.ld_price_promise_flag = :price_promise_flag";
    
//    private final static String SELECT_SUCCESFUL_LEADS_COUNT_BY_CRYTERIA =
//    		"select count(*) as total"
//    		+ " from lead l, sales s, referral r" // , f_carcode c"
//    		+ " where l.ld_lead_id = s.lead_id"
//
//            + " and r.rf_lead_id = s.lead_id"
//           // + " and c.partner_lead_id = l.ld_partner_lead_id"
//            + " and r.rf_edmunds_make = :vehicle_make"
//        //  /*!*/  + " and  r.rf_edmunds_model = :rf_edmunds_model"
//            + " and r.rf_edmunds_year between :vehicle_year_from and :vehicle_year_to"
//            + " and r.rf_offer_price between :price_from and :price_to"
//            + " and l.ld_price_promise_flag = :price_promise_flag";








    private final static String SELECT_CARCODE_BY_LEAD_ID =
            "select c.k_carcode_id as carcode_id from lead l"
          + " inner join sales s"
          + " on l.ld_lead_id = s.lead_id"
          + " inner join f_carcode c"
          + " on s.partner_lead_id = c.partner_lead_id"
          + " where l.ld_lead_id = ?";

    private final static String SELECT_OFFER_PRICE_AND_TMV_SQL =
    "select r.rf_offer_price, r.rf_tmv_price from lead l"
    + " inner join referral r"
    + " on l.ld_lead_id = r.rf_lead_id"
    + " where l.ld_lead_id = ?";



    private final RowMapper<Long> TOTAL_ROW_MAPPER = new RowMapper<Long>() {
        @Override
        public Long mapRow(ResultSet rs, int rowNum) throws SQLException {
            return rs.getLong("total");
        }
    };

    @SuppressWarnings("unchecked")
	@Override
    public Long findTotalCountByCriteria(LeadCriteria criteria) {

        Map namedParameters = criteriaToMap(criteria);
        return namedParameterJdbcTemplate.queryForObject(SELECT_LEADS_COUNT_BY_CRYTERIA,
                namedParameters,  TOTAL_ROW_MAPPER);
    }

    @SuppressWarnings("unchecked")
	@Override
    public Long findSuccessfulCountByCriteria(LeadCriteria criteria) {
        Map namedParameters = criteriaToMap(criteria);
        return namedParameterJdbcTemplate.queryForObject(SELECT_SUCCESFUL_LEADS_COUNT_BY_CRYTERIA,
                namedParameters,  TOTAL_ROW_MAPPER);
    }

    @Override
    public SmallLeadDO findById(Long leadId) {
        List<SmallLeadDO> results = jdbcTemplate.query(SELECT_SMALL_LEAD_BY_ID_SQL, new Object[]{leadId},
                SMALL_LEAD_MAPPER);
        if (CollectionUtils.isNotEmpty(results)) {
            return DataAccessUtils.singleResult(results);
        }
        return null;
    }

    @Override
    public boolean isCarcode(Long leadId) {
        List<String> carcodeIds = jdbcTemplate.query(SELECT_CARCODE_BY_LEAD_ID, new Object[]{leadId}, new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getString("carcode_id");
            }
        });
        return CollectionUtils.isNotEmpty(carcodeIds);
    }

    @Override
    public OfferPriceAndTMVDO findOfferPriceAndTmv(Long leadId) {

        List<OfferPriceAndTMVDO> results = jdbcTemplate.query(SELECT_OFFER_PRICE_AND_TMV_SQL, new Object[]{leadId}, new RowMapper<OfferPriceAndTMVDO>() {
            @Override
            public OfferPriceAndTMVDO mapRow(ResultSet rs, int rowNum) throws SQLException {
                OfferPriceAndTMVDO tmvdo = new OfferPriceAndTMVDO();
                tmvdo.setOfferPrice(rs.getDouble("rf_offer_price"));
                tmvdo.setTrueMarketValue(rs.getDouble("rf_tmv_price"));
                return tmvdo;
            }
        });
        if (CollectionUtils.isNotEmpty(results)) {
            return DataAccessUtils.singleResult(results);
        }
        return null;
    }

    private Map criteriaToMap(LeadCriteria criteria) {
        Map<String, Object> namedParameters = new HashMap();
        namedParameters.put("vehicle_make", criteria.getVehicleMake());
        namedParameters.put("vehicle_year_from", criteria.getYear() - criteria.getYearDelta());
        namedParameters.put("vehicle_year_to", criteria.getYear() + criteria.getYearDelta());
        namedParameters.put("price_promise_flag", criteria.isPricePromise());
        namedParameters.put("rf_edmunds_model", criteria.getVehicleModel());
        namedParameters.put("price_from", criteria.getPrice() - criteria.getPriceDelta());
        namedParameters.put("price_to", criteria.getPrice() + criteria.getPriceDelta());
        namedParameters.put("car_code", criteria.getCarCode());
        return namedParameters;
    }

}
