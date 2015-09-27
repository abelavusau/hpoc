package com.abelavusau.restfulapi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.RowMapper;

import com.abelavusau.restfulapi.vo.LeadVO;

public class LeadVOMapper implements RowMapper<LeadVO> {

	@Override
	public LeadVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		LeadVO leadVO = new LeadVO();
		leadVO.setDealerDistance(rs.getString("dealer_distance"));
		String stringLeadIds = rs.getString("lead_ids");

		List<String> stringLeadIdsList = Arrays.asList(StringUtils.split(stringLeadIds, ','));
		List<Long> leadIds = stringLeadIdsList.stream().filter(
				leadId -> StringUtils.isNotBlank(leadId) && StringUtils.isNumeric(leadId))
				.map(leadId -> Long.valueOf(leadId)).collect(Collectors.<Long>toList());


		leadVO.setLeadIds(leadIds);
		leadVO.setSessionId(rs.getString("session_id"));
		leadVO.setLeadType(rs.getString("lead_type"));
		leadVO.setOfferPrice(rs.getString("offer_price"));
		leadVO.setPricePromiseFlag(rs.getString("price_promise_flag"));
		return leadVO;
	}
}
