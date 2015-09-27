package com.abelavusau.restfulapi.dao;

import java.util.List;

import com.abelavusau.restfulapi.domain.LeadStatisticsDO;
import com.abelavusau.restfulapi.model.LeadStatisticsModel;

public interface LeadDao {
	List<LeadStatisticsDO> getAll();
}
