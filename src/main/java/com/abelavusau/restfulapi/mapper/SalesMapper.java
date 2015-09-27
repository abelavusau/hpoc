package com.abelavusau.restfulapi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.abelavusau.restfulapi.model.Sales;

public class SalesMapper implements RowMapper<Sales> {

	@Override
	public Sales mapRow(ResultSet rs, int rowNum) throws SQLException {
		Sales sales = new Sales();
		
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
