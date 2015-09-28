package com.a3m.service;

import java.util.List;

import com.a3m.model.LeadStatisticsModel;

public interface LeadService {
    List<LeadStatisticsModel> findAll();
}
