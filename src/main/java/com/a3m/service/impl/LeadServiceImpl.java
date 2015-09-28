package com.a3m.service.impl;


import java.util.List;

import com.a3m.dao.LeadDao;
import com.a3m.domain.LeadStatisticsDO;
import com.a3m.model.LeadStatisticsModel;
import com.a3m.service.LeadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.stereotype.Component;

@Component
public class LeadServiceImpl implements LeadService {

    @Autowired
    private ConversionService conversionService;

    @Autowired
    private LeadDao leadDao;

    @Override
    public List<LeadStatisticsModel> findAll() {
        List<LeadStatisticsDO> leadDos = leadDao.getAll();
        return (List<LeadStatisticsModel>)conversionService.convert(leadDos,
                TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(LeadStatisticsDO.class)),
                TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(LeadStatisticsModel.class)));
    }
}
