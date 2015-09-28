package com.a3m.dao.impl;

import java.util.List;

import com.a3m.dao.LeadDao;
import com.a3m.domain.LeadStatisticsDO;
import com.a3m.mapper.LeadStatisticsDOMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LeadDaoImpl implements LeadDao {
	@Autowired
	private JdbcTemplate template;
	
	private final LeadStatisticsDOMapper MAPPER = new LeadStatisticsDOMapper();
	
	private final String SQL = "SELECT session_id, customer_email, dealer_distance,  array_to_string(array_agg(k_lead_id ), ',') as lead_ids, lead_type, offer_price, price_promise_flag " +
			"FROM f_lead " +
			"GROUP BY session_id, customer_email, dealer_distance, lead_type, offer_price, price_promise_flag;";
	
	@Override
	public List<LeadStatisticsDO> getAll() {
		return template.query(SQL, MAPPER);
	}
}
