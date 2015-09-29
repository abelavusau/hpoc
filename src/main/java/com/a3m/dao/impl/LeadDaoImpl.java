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
	
	private final static String SELECT_ALL_SQL = "SELECT session_id, customer_email, dealer_distance,  array_to_string(array_agg(k_lead_id ), ',') as lead_ids, lead_type, offer_price, price_promise_flag " +
			"FROM f_lead " +
			"GROUP BY session_id, customer_email, dealer_distance, lead_type, offer_price, price_promise_flag;";

	private final static String SELECT_BY_ID_SQL = "SELECT session_id, customer_email, dealer_distance,  k_lead_id as lead_ids, lead_type, offer_price, price_promise_flag FROM f_lead where k_lead_id = ?";

	private final static String SELECT_ALL_LEADS_SQL = "SELECT * from F_LEAD";
	
	@Override
	public List<LeadStatisticsDO> getAll() {
		return template.query(SELECT_ALL_SQL, LEAD_STATISTIC_MAPPER);
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
