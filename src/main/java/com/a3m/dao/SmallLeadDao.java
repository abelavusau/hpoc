package com.a3m.dao;


import com.a3m.domain.OfferPriceAndTMVDO;
import com.a3m.domain.SmallLeadDO;
import com.a3m.model.LeadCriteria;

public interface SmallLeadDao {
    Long findTotalCountByCriteria(LeadCriteria criteria);
    Long findSuccessfulCountByCriteria(LeadCriteria criteria);
    SmallLeadDO findById(Long leadId);
    boolean isCarcode(Long leadId);
    OfferPriceAndTMVDO findOfferPriceAndTmv(Long leadId);
}
