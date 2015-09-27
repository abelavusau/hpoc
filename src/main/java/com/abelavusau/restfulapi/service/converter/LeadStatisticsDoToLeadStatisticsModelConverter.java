package com.abelavusau.restfulapi.service.converter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.abelavusau.restfulapi.domain.LeadStatisticsDO;
import com.abelavusau.restfulapi.model.LeadStatisticsModel;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

public class LeadStatisticsDoToLeadStatisticsModelConverter implements Converter<LeadStatisticsDO, LeadStatisticsModel> {

    @Override
    public LeadStatisticsModel convert(LeadStatisticsDO source) {
        LeadStatisticsModel target = new LeadStatisticsModel();

        final List<Long> leadIds;
        if (StringUtils.isNotBlank(source.getLeadIds())) {
            List<String> stringLeadIdsList = Arrays.asList(StringUtils.split(source.getLeadIds(), ','));
            leadIds = stringLeadIdsList.stream().filter(
                    leadId -> StringUtils.isNotBlank(leadId) && StringUtils.isNumeric(leadId))
                    .map(leadId -> Long.valueOf(leadId)).collect(Collectors.<Long>toList());
        } else {
            leadIds = Collections.<Long>emptyList();
        }

        target.setLeadIds(leadIds);
        target.setLeadsTotal(CollectionUtils.isNotEmpty(leadIds) ? leadIds.size() : Integer.valueOf(0));

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
