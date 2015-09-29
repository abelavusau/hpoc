package com.a3m.service.impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.stereotype.Service;

import com.a3m.dao.LeadDao;
import com.a3m.dao.SalesDAO;
import com.a3m.domain.LeadDO;
import com.a3m.domain.SalesDO;
import com.a3m.model.SalesModel;
import com.a3m.service.SalesService;

@Service
public class SalesServiceImpl implements SalesService {

    @Autowired
    private SalesDAO salesDAO;
    
    @Autowired
    private LeadDao leadDAO;

    @Autowired
    private ConversionService conversionService;
    
    private static final Random RANDOM = new Random();

    @Override
    public List<SalesModel> getSales(List<Long> leadIds) {
        List<SalesDO> sales = salesDAO.getSales(leadIds);

        return (List<SalesModel>)conversionService.convert(sales,
                TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(SalesDO.class)),
                TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(SalesModel.class)));

    }

	@Override
	public void updateSalesToMatchLeads(int successPercentage) {
		List<LeadDO> leads = leadDAO.getAllLeads();
		List<SalesDO> sales = salesDAO.getSales();

        int t = (int)(leads.size() * successPercentage / 100.);
        for (int i = 0; i < t; ++i) {
           Long successfulLeadId = getRandomLeadId(leads);
            salesDAO.updateSalesToMatchLeads(sales.get(RANDOM.nextInt(sales.size())), successfulLeadId);
        }
//
//		for (SalesDO salesDO : sales) {
//			if (RANDOM.nextInt(100) <= successPercentage) {
//				salesDAO.updateSalesToMatchLeads(salesDO, getRandomLeadId(leads));
//			}
//		}
	}
	
	private Long getRandomLeadId(List<LeadDO> leads) {
		return leads.get(RANDOM.nextInt(leads.size())).getLd_lead_id();
	}
}
