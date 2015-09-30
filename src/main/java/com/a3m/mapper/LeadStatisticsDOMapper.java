package com.a3m.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.a3m.domain.LeadStatisticsDO;

public class LeadStatisticsDOMapper implements RowMapper<LeadStatisticsDO> {

	@Override
	public LeadStatisticsDO mapRow(ResultSet rs, int rowNum) throws SQLException {
		LeadStatisticsDO leadVO = new LeadStatisticsDO();
		leadVO.setDealerDistance(rs.getString("ld_dealer_distance"));
		String stringLeadIds = rs.getString("lead_ids");

		leadVO.setLeadIds(stringLeadIds);
		leadVO.setSessionId(rs.getString("ld_user_session"));
		leadVO.setLeadTypeId(rs.getLong("ld_lead_type_id"));
		leadVO.setOfferPrice(rs.getString("rf_offer_price"));
		leadVO.setPricePromiseFlag(rs.getString("ld_price_promise_flag"));
		return leadVO;
	}
}
