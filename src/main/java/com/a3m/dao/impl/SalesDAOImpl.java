package com.a3m.dao.impl;

import java.util.Collections;
import java.util.List;

import com.a3m.dao.SalesDAO;
import com.a3m.domain.SalesDO;
import com.a3m.mapper.SalesDOMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;


@Repository
public class SalesDAOImpl implements SalesDAO {

	private static final String GET_SALES_BY_LEAD_ID_QUERY = "SELECT * FROM sales WHERE lead_id in (:ids)";
	private static final SalesDOMapper MAPPER = new SalesDOMapper();

	@Autowired
	private NamedParameterJdbcTemplate template;

	@Override
	public List<SalesDO> getSales(List<Long> leadIds) {
		if (CollectionUtils.isEmpty(leadIds)) {
			return Collections.<SalesDO>emptyList();
		}
		
		return template.query(GET_SALES_BY_LEAD_ID_QUERY, Collections.singletonMap("ids", leadIds), MAPPER);
	}
}
