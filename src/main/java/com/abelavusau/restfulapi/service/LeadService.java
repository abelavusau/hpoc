package com.abelavusau.restfulapi.service;

import java.util.List;

import com.abelavusau.restfulapi.model.LeadStatisticsModel;

public interface LeadService {
    List<LeadStatisticsModel> findAll();
}
