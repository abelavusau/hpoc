package com.a3m.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.a3m.dao.LeadDao;
import com.a3m.domain.LeadDO;
import com.a3m.domain.LeadStatisticsDO;
import com.a3m.mapper.LeadStatisticsDOMapper;

import com.a3m.model.LeadCriteria;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LeadDaoImpl implements LeadDao {
	@Autowired
	private JdbcTemplate template;

	private final LeadStatisticsDOMapper MAPPER = new LeadStatisticsDOMapper();

	private final String SELECT_ALL_SQL = "SELECT session_id, customer_email, dealer_distance,  array_to_string(array_agg(k_lead_id ), ',') as lead_ids, lead_type, offer_price, price_promise_flag " +
			"FROM f_lead " +
			"GROUP BY session_id, customer_email, dealer_distance, lead_type, offer_price, price_promise_flag;";

	private final String SELECT_BY_ID_SQL = "SELECT session_id, customer_email, dealer_distance,  k_lead_id as lead_ids, lead_type, offer_price, price_promise_flag FROM f_lead where k_lead_id = ?";



	@Override
	public List<LeadStatisticsDO> getAll() {
		return template.query(SELECT_ALL_SQL, MAPPER);
	}

	@Override
	public LeadStatisticsDO getById(Long leadId) {
		List<LeadStatisticsDO> results = template.query(SELECT_BY_ID_SQL, new Object[]{leadId},
				new RowMapperResultSetExtractor<LeadStatisticsDO>(MAPPER, 1));
		if (CollectionUtils.isNotEmpty(results)) {
			return DataAccessUtils.singleResult(results);
		}
		return  null;
	}




}
