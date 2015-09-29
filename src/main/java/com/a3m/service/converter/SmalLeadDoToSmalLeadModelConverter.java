package com.a3m.service.converter;


import com.a3m.domain.SmallLeadDO;
import com.a3m.model.SmallLeadModel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

public class SmalLeadDoToSmalLeadModelConverter implements Converter<SmallLeadDO, SmallLeadModel> {
    @Override
    public SmallLeadModel convert(SmallLeadDO source) {
        SmallLeadModel model = new SmallLeadModel();
        model.setVehicleMake(source.getVehicleMake());
        String yearString = source.getVehicleYear();
        final Integer year;
        if (StringUtils.isNumeric(yearString)) {
            year = Integer.valueOf(yearString);
        }  else {
            year = null;
        }
        model.setVehicleYear(year);

        if (source.isPricePromise() != null) {
            model.setPricePromise("Y".equals(source.isPricePromise()));
        } else {
            model.setPricePromise(null);
        }
        model.setOfferPrice(source.getOfferPrice());
        return model;
    }
}
