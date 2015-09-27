package com.abelavusau.restfulapi.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.abelavusau.restfulapi.dao.SalesDAO;
import com.abelavusau.restfulapi.mapper.SalesMapper;
import com.abelavusau.restfulapi.model.Sales;

@Repository
public class SalesDAOImpl implements SalesDAO {

	private static final String GET_SALES_BY_LEAD_ID_QUERY = "SELECT * FROM sales WHERE lead_id = ?";
	private static final SalesMapper MAPPER = new SalesMapper();
	@Autowired
	private JdbcTemplate template;

	@Override
	public Sales getSales(long leadId) {
		return template.queryForObject(GET_SALES_BY_LEAD_ID_QUERY
				, new Object[] { leadId }
		, MAPPER);
	}
}
