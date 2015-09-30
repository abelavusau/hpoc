package com.a3m.service.impl;


import com.a3m.dao.SmallLeadDao;
import com.a3m.domain.OfferPriceAndTMVDO;
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
    public SmallLeadModel findById(Long leadId, Double price, Boolean pricePromise, Boolean carCode) {

        SmallLeadDO smallLeadDO = smallLeadDao.findById(leadId);
        if (smallLeadDO == null) {
            return null;
        }
        SmallLeadModel model = conversionService.convert(smallLeadDO, SmallLeadModel.class);

        // set price because it it's required for rate
        OfferPriceAndTMVDO offerPriceAndTMVDO = smallLeadDao.findOfferPriceAndTmv(leadId);
        if (offerPriceAndTMVDO != null) {
            model.setOfferPrice(offerPriceAndTMVDO.getOfferPrice());
            model.setTrueMarketValue(offerPriceAndTMVDO.getTrueMarketValue());
        }
        // calculate car  code because it's used for rate
        model.setCarCode(smallLeadDao.isCarcode(leadId));

        final Double rate = calculateRate(model, price, pricePromise, carCode);
        model.setRate(rate);
        return model;
    }

    private Double calculateRate(SmallLeadModel model, Double price, Boolean pricePromise, Boolean carCode) {

        if (price == null) {
            price = model.getOfferPrice();
        }
        if (pricePromise == null) {
            pricePromise = model.isPricePromise();
        }
        if (carCode == null) {
            carCode = model.getCarCode();
        }

        LeadCriteria criteria = new LeadCriteria();
        criteria.setVehicleMake(model.getVehicleMake());
        criteria.setPricePromise(pricePromise);
        criteria.setYear(model.getVehicleYear());
        criteria.setPrice(price);
        criteria.setCarCode(carCode);
        criteria.setYearDelta(LeadCriteria.DEFAULT_YEAR_DELTA);
        criteria.setPriceDelta(LeadCriteria.DEFAULT_OFFER_PRICE_DELTA);

        return successRateByCriteria(criteria);
    }

    public Double successRateByCriteria(LeadCriteria criteria) {
        Long total = smallLeadDao.findTotalCountByCriteria(criteria);
        if (NumberUtils.LONG_ZERO.equals(total)) {
            return NumberUtils.DOUBLE_ZERO;
        }
        Long successfulCount = smallLeadDao.findSuccessfulCountByCriteria(criteria);
        return Double.valueOf(successfulCount)/Double.valueOf(total);
    }
}
