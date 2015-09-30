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
        model.setVehicleModel(source.getVehicleModel());
		model.setVehicleYear(source.getVehicleYear());
		model.setPricePromise(source.isPricePromise());
		model.setOfferPrice(source.getOfferPrice());

		return model;
	}
}
