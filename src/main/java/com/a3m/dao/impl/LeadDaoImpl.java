package com.a3m.dao.impl;

import java.util.List;

import com.a3m.dao.LeadDao;
import com.a3m.domain.LeadDO;
import com.a3m.domain.LeadStatisticsDO;
import com.a3m.mapper.LeadDOMapper;
import com.a3m.mapper.LeadStatisticsDOMapper;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class LeadDaoImpl implements LeadDao {
	@Autowired
	private JdbcTemplate template;
	
	private final static LeadStatisticsDOMapper LEAD_STATISTIC_MAPPER = new LeadStatisticsDOMapper();
	private final static LeadDOMapper LEAD_MAPPER = new LeadDOMapper();
	
	private final static String SELECT_ALL_GROUP_BY_SESSION_ID_SQL = "SELECT l.ld_user_session"
			+ ", l.ld_dealer_distance"
			+ ", array_to_string(array_agg(ld_lead_id ), ',') as lead_ids"
			+ ", l.ld_lead_type_id"
			+ ", l.ld_price_promise_flag"
			+ ", r.rf_offer_price"
			+ " FROM lead l INNER JOIN referral r ON l.ld_lead_id = r.rf_lead_id"
			+ " GROUP BY l.ld_user_session, l.ld_dealer_distance, l.ld_lead_type_id, l.ld_price_promise_flag, r.rf_offer_price";

	private final static String SELECT_BY_ID_SQL = "SELECT l.ld_user_session"
			+ ", l.ld_dealer_distance"
			+ ", l.ld_lead_id"
			+ ", l.ld_lead_type_id"
			+ ", l.ld_price_promise_flag"
			+ ", r.rf_offer_price"
			+ " FROM lead l"
			+ " INNER JOIN referral r"
			+ " ON l.ld_lead_id = r.rf_lead_id"
			+ " where ld_lead_id = ?";

	private final static String SELECT_ALL_LEADS_SQL = "SELECT * from LEAD";
	
	@Override
	public List<LeadStatisticsDO> getAll() {
		return template.query(SELECT_ALL_GROUP_BY_SESSION_ID_SQL, LEAD_STATISTIC_MAPPER);
	}

	@Override
	public LeadStatisticsDO getById(Long leadId) {
		List<LeadStatisticsDO> results = template.query(SELECT_BY_ID_SQL, new Object[]{leadId},
				new RowMapperResultSetExtractor<LeadStatisticsDO>(LEAD_STATISTIC_MAPPER, 1));
		if (CollectionUtils.isNotEmpty(results)) {
			return DataAccessUtils.singleResult(results);
		}
		return  null;
	}

	@Override
	public List<LeadDO> getAllLeads() {
		return template.query(SELECT_ALL_LEADS_SQL, LEAD_MAPPER);
	}
}
