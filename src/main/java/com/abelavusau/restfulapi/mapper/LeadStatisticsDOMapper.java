package com.abelavusau.restfulapi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.abelavusau.restfulapi.domain.LeadStatisticsDO;
import org.springframework.jdbc.core.RowMapper;

public class LeadStatisticsDOMapper implements RowMapper<LeadStatisticsDO> {

	@Override
	public LeadStatisticsDO mapRow(ResultSet rs, int rowNum) throws SQLException {
		LeadStatisticsDO leadVO = new LeadStatisticsDO();
		leadVO.setDealerDistance(rs.getString("dealer_distance"));
		String stringLeadIds = rs.getString("lead_ids");

		leadVO.setLeadIds(stringLeadIds);
		leadVO.setSessionId(rs.getString("session_id"));
		leadVO.setLeadType(rs.getString("lead_type"));
		leadVO.setOfferPrice(rs.getString("offer_price"));
		leadVO.setPricePromiseFlag(rs.getString("price_promise_flag"));
		return leadVO;
	}
}
