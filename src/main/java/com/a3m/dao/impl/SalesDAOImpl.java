package com.a3m.dao.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.a3m.dao.SalesDAO;
import com.a3m.domain.SalesDO;
import com.a3m.mapper.SalesDOMapper;


@Repository
public class SalesDAOImpl implements SalesDAO {

	private static final String GET_SALES_BY_LEAD_ID_QUERY = "SELECT * FROM sales WHERE lead_id in (:ids)";
	private static final String GET_ALL_SALES_QUERY = "SELECT * FROM sales";
	private static final String UPDATE_SALES_TO_MATCH_LEAD_QUERY =
			"UPDATE sales"
			+ " SET lead_id=(:newLeadId)"
			+ " WHERE lead_id=(:currentLeadId)";
	
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

	@Override
	public List<SalesDO> getSales() {
		return template.query(GET_ALL_SALES_QUERY, MAPPER);
	}

	@Override
	public void updateSalesToMatchLeads(SalesDO sales, Long newLeadId) {
		Map<String, ? super Object> paramMap = new HashMap<String, Object>(2);
		paramMap.put("newLeadId", newLeadId);
		paramMap.put("currentLeadId", sales.getLeadId());
		template.update(UPDATE_SALES_TO_MATCH_LEAD_QUERY, paramMap);
	}
}
