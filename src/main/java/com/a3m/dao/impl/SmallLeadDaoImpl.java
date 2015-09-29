package com.a3m.dao.impl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.a3m.dao.SmallLeadDao;
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

    private final String SELECT_BY_ID_SQL = "SELECT * FROM f_lead where k_lead_id = ?";

    private final String SELECT_LEADS_COUNT_BY_CRYTERIA = "select count(*) as total from f_lead where vehicle_make = :vehicle_make and CAST(nullif(vehicle_year, '') AS integer) between :vehicle_year_from and :vehicle_year_to and price_promise_flag = :price_promise_flag";
    private final String SELECT_SUCCESFUL_LEADS_COUNT_BY_CRYTERIA = "select count(*) as total from f_lead l, sales s" +
            "  where l.k_lead_id = s.lead_id and l.vehicle_make = :vehicle_make and CAST(nullif(l.vehicle_year, '') AS integer) between :vehicle_year_from and :vehicle_year_to and l.price_promise_flag = :price_promise_flag";


    private final RowMapper<Long> TOTAL_ROW_MAPPER = new RowMapper<Long>() {
        @Override
        public Long mapRow(ResultSet rs, int rowNum) throws SQLException {
            return rs.getLong("total");
        }
    };

    private RowMapper<SmallLeadDO> SMALL_LEAD_MAPPER = new SmallLeadDOMapper();

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    private JdbcTemplate jdbcTemplate;



    @Override
    public Long findTotalCountByCriteria(LeadCriteria criteria) {

        Map namedParameters = criteriaToMap(criteria);
        return namedParameterJdbcTemplate.queryForObject(SELECT_LEADS_COUNT_BY_CRYTERIA,
                namedParameters,  TOTAL_ROW_MAPPER);
    }

    @Override
    public Long findSuccessfulCountByCriteria(LeadCriteria criteria) {
        Map namedParameters = criteriaToMap(criteria);
        return namedParameterJdbcTemplate.queryForObject(SELECT_SUCCESFUL_LEADS_COUNT_BY_CRYTERIA,
                namedParameters,  TOTAL_ROW_MAPPER);
    }

    @Override
    public SmallLeadDO findById(Long leadId) {
        List<SmallLeadDO> results = jdbcTemplate.query(SELECT_BY_ID_SQL, new Object[]{leadId},
                SMALL_LEAD_MAPPER);
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
        namedParameters.put("price_promise_flag", criteria.isPricePromise() ? "Y" : "N");
        return namedParameters;
    }

}
