package com.abelavusau.restfulapi.service.converter;


import com.abelavusau.restfulapi.domain.SalesDO;
import com.abelavusau.restfulapi.model.SalesModel;
import org.springframework.core.convert.converter.Converter;

public class SalesDOToSalesModelConverter implements Converter<SalesDO, SalesModel> {

    @Override
    public SalesModel convert(SalesDO source) {
        SalesModel target = new SalesModel();
        target.setTransactionId(source.getTransactionId());
        target.setPurchaseDealerId(source.getPurchaseDealerId());
        target.setPurchaseDealer(source.getPurchaseDealer());
        target.setMatchType(source.getMatchType());
        target.setLeadId(source.getLeadId());
        target.setLeadDealer(source.getLeadDealer());
        target.setLeadComment(source.getLeadComment());
        target.setPartnerLeadId(source.getPartnerLeadId());
        return target;
    }
}
