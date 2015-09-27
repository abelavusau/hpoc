package com.abelavusau.restfulapi.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.abelavusau.restfulapi.dao.LeadVODao;
import com.abelavusau.restfulapi.mapper.LeadVOMapper;
import com.abelavusau.restfulapi.vo.LeadVO;

@Repository
public class LeadVODaoImpl implements LeadVODao {
	@Autowired
	private JdbcTemplate template;
	
	private final LeadVOMapper MAPPER = new LeadVOMapper();
	
	private final String SQL = "SELECT session_id, customer_email, dealer_distance,  array_to_string(array_agg(k_lead_id ), ',') as lead_ids, lead_type, offer_price, price_promise_flag " +
			"FROM f_lead " +
			"GROUP BY session_id, customer_email, dealer_distance, lead_type, offer_price, price_promise_flag;";
	
	@Override
	public List<LeadVO> getAll() {
		return template.query(SQL, MAPPER);
	}
}
