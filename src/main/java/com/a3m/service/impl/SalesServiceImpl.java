package com.a3m.service.impl;

import java.util.List;

import com.a3m.dao.SalesDAO;
import com.a3m.domain.SalesDO;
import com.a3m.model.SalesModel;
import com.a3m.service.SalesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.stereotype.Service;

@Service
public class SalesServiceImpl implements SalesService {

    @Autowired
    private SalesDAO salesDAO;

    @Autowired
    private ConversionService conversionService;

    @Override
    public List<SalesModel> getSales(List<Long> leadIds) {
        List<SalesDO> sales = salesDAO.getSales(leadIds);

        return (List<SalesModel>)conversionService.convert(sales,
                TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(SalesDO.class)),
                TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(SalesModel.class)));

    }
}
