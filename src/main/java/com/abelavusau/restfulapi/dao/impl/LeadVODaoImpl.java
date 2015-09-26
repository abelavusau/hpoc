package com.abelavusau.restfulapi.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.abelavusau.restfulapi.dao.LeadVODao;
import com.abelavusau.restfulapi.mapper.LeadVOMapper;
import com.abelavusau.restfulapi.vo.LeadVO;

@Repository
public class LeadVODaoImpl implements LeadVODao {
	@Autowired
	private JdbcTemplate template;
	
	private final LeadVOMapper MAPPER = new LeadVOMapper();
	
	private final String sql = "SELECT * FROM F_LEAD";
	
	@Override
	public List<LeadVO> getAll() {
		return template.query(sql, MAPPER);
	}
}
