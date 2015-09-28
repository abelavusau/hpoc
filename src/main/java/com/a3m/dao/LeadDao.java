package com.a3m.dao;

import java.util.List;

import com.a3m.domain.LeadStatisticsDO;

public interface LeadDao {
	List<LeadStatisticsDO> getAll();

	LeadStatisticsDO getById(Long leadId);
}
