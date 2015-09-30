package com.a3m.domain;

import java.io.Serializable;

public class SalesDO implements Serializable {

    private Long transactionId;
    private Long purchaseDealerId;
    private String purchaseDealer;
    private String matchType;
    private Long leadId;
    private String leadDealer;
    private String leadComment;
    private Long partnerLeadId;


    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getPurchaseDealerId() {
        return purchaseDealerId;
    }

    public void setPurchaseDealerId(Long purchaseDealerId) {
        this.purchaseDealerId = purchaseDealerId;
    }

    public String getPurchaseDealer() {
        return purchaseDealer;
    }

    public void setPurchaseDealer(String purchaseDealer) {
        this.purchaseDealer = purchaseDealer;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public Long getLeadId() {
        return leadId;
    }

    public void setLeadId(Long leadId) {
        this.leadId = leadId;
    }

    public String getLeadDealer() {
        return leadDealer;
    }

    public void setLeadDealer(String leadDealer) {
        this.leadDealer = leadDealer;
    }

    public String getLeadComment() {
        return leadComment;
    }

    public void setLeadComment(String leadComment) {
        this.leadComment = leadComment;
    }

    public Long getPartnerLeadId() {
        return partnerLeadId;
    }

    public void setPartnerLeadId(Long partnerLeadId) {
        this.partnerLeadId = partnerLeadId;
    }
}
