package com.abelavusau.restfulapi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.abelavusau.restfulapi.vo.LeadVO;

public class LeadVOMapper implements RowMapper<LeadVO> {

	@Override
	public LeadVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		LeadVO leadVO = new LeadVO();
		leadVO.setDealerDistance(rs.getString("dealer_distance"));
		leadVO.setLeadId(rs.getLong("k_lead_id"));
		leadVO.setSessionId(rs.getString("session_id"));
		leadVO.setLeadType(rs.getString("lead_type"));
		leadVO.setOfferPrice(rs.getString("offer_price"));
		leadVO.setPricePromiseFlag(rs.getString("price_promise_flag"));
		return leadVO;
	}
}
