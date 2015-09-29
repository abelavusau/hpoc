package com.a3m.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.a3m.domain.LeadDO;

public class LeadDOMapper implements RowMapper<LeadDO> {

	@Override
	public LeadDO mapRow(ResultSet rs, int rowNum) throws SQLException {
		LeadDO leadVO = new LeadDO();
		leadVO.setLd_lead_id(rs.getLong("ld_lead_id"));
		return leadVO;
	}
}