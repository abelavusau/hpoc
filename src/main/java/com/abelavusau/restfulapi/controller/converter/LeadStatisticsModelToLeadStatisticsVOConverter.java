package com.abelavusau.restfulapi.controller.converter;


import com.abelavusau.restfulapi.model.LeadStatisticsModel;
import com.abelavusau.restfulapi.vo.LeadStatisticsVO;
import org.springframework.core.convert.converter.Converter;


public class LeadStatisticsModelToLeadStatisticsVOConverter implements Converter <LeadStatisticsModel, LeadStatisticsVO>{
    @Override
    public LeadStatisticsVO convert(LeadStatisticsModel source) {
        LeadStatisticsVO target = new LeadStatisticsVO();

        target.setLeadIds(source.getLeadIds());
        target.setLeadsTotal(source.getLeadsTotal());
        target.setSessionId(source.getSessionId());
        target.setDealerDistance(source.getDealerDistance());
        target.setPricePromiseFlag(source.getPricePromiseFlag());
        target.setLeadType(source.getLeadType());
        target.setOfferPrice(source.getOfferPrice());
        target.setTrueMarketValue(source.getTrueMarketValue());
        target.setAlikeBuysNumber(source.getAlikeBuysNumber());
        target.setViewedCars(source.getViewedCars());
        target.setDecisionTime(source.getDecisionTime());
        return target;
    }
}
