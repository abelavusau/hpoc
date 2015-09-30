package com.a3m.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.a3m.domain.SalesDO;

public class SalesDOMapper implements RowMapper<SalesDO> {

	@Override
	public SalesDO mapRow(ResultSet rs, int rowNum) throws SQLException {
		SalesDO sales = new SalesDO();
		
		sales.setLeadComment(rs.getString("lead_comment"));
		sales.setLeadDealer(rs.getString("lead_dealer"));
		sales.setLeadId(rs.getLong("lead_id"));
		sales.setMatchType(rs.getString("match_type"));
		sales.setPartnerLeadId(rs.getLong("partner_lead_id"));
		sales.setPurchaseDealer(rs.getString("purchase_dealer"));
		sales.setPurchaseDealerId(rs.getLong("purchase_dealer_id"));
		sales.setTransactionId(rs.getLong("f_transaction_id"));
		
		return sales;
	}
}
