package com.a3m.dao;

import java.util.List;

import com.a3m.domain.LeadDO;
import com.a3m.domain.LeadStatisticsDO;
import com.a3m.model.LeadCriteria;

public interface LeadDao {
	List<LeadStatisticsDO> getAll();

	LeadStatisticsDO getById(Long leadId);

}
