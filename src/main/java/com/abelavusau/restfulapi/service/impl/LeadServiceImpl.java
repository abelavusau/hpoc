package com.abelavusau.restfulapi.service.impl;


import java.util.List;

import com.abelavusau.restfulapi.dao.LeadDao;
import com.abelavusau.restfulapi.domain.LeadStatisticsDO;
import com.abelavusau.restfulapi.service.LeadService;
import com.abelavusau.restfulapi.model.LeadStatisticsModel;
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
