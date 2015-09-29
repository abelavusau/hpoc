package com.a3m.service.impl;


import com.a3m.dao.SmallLeadDao;
import com.a3m.domain.SmallLeadDO;
import com.a3m.model.LeadCriteria;
import com.a3m.model.SmallLeadModel;
import com.a3m.service.SmallLeadsService;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
public class SmallLeadsServiceImp implements SmallLeadsService {

    @Autowired
    private SmallLeadDao smallLeadDao;

    @Autowired
    private ConversionService conversionService;


    @Override
    public SmallLeadModel findById(Long leadId) {

        SmallLeadDO smallLeadDO = smallLeadDao.findById(leadId);
        if (smallLeadDO == null) {
            return null;
        }
        SmallLeadModel model = conversionService.convert(smallLeadDO, SmallLeadModel.class);

        Double rate = calculateRate(model);
        model.setRate(rate);
        return model;
    }

    private Double calculateRate(SmallLeadModel model) {
        LeadCriteria criteria = new LeadCriteria();
        criteria.setVehicleMake(model.getVehicleMake());
        criteria.setPricePromise(model.isPricePromise());
        criteria.setYear(model.getVehicleYear());
        criteria.setYearDelta(LeadCriteria.DEFAULT_YEAR_DELTA);

        return successRateByCriteria(criteria);
    }

    public Double successRateByCriteria(LeadCriteria criteria) {
        Long total = smallLeadDao.findTotalCountByCriteria(criteria);
        if (NumberUtils.LONG_ZERO.equals(total)) {
            return null;
        }
        Long successfulCount = smallLeadDao.findSuccessfulCountByCriteria(criteria);
        return Double.valueOf(successfulCount)/Double.valueOf(total);
    }
}
