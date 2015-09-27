package com.abelavusau.restfulapi.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class LeadStatisticsDO implements Serializable {
    private String leadIds;

    private String sessionId;
    private String dealerDistance;
    private String pricePromiseFlag;
    private String leadType;
    private String offerPrice;
    private String trueMarketValue;
    private Integer alikeBuysNumber;
    private List<Integer> viewedCars;
    private Date decisionTime;

    public String getLeadIds() {
        return leadIds;
    }

    public void setLeadIds(String leadIds) {
        this.leadIds = leadIds;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getDealerDistance() {
        return dealerDistance;
    }

    public void setDealerDistance(String dealerDistance) {
        this.dealerDistance = dealerDistance;
    }

    public String getPricePromiseFlag() {
        return pricePromiseFlag;
    }

    public void setPricePromiseFlag(String pricePromiseFlag) {
        this.pricePromiseFlag = pricePromiseFlag;
    }

    public String getLeadType() {
        return leadType;
    }

    public void setLeadType(String leadType) {
        this.leadType = leadType;
    }

    public String getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(String offerPrice) {
        this.offerPrice = offerPrice;
    }

    public String getTrueMarketValue() {
        return trueMarketValue;
    }

    public void setTrueMarketValue(String trueMarketValue) {
        this.trueMarketValue = trueMarketValue;
    }

    public Integer getAlikeBuysNumber() {
        return alikeBuysNumber;
    }

    public void setAlikeBuysNumber(Integer alikeBuysNumber) {
        this.alikeBuysNumber = alikeBuysNumber;
    }

    public List<Integer> getViewedCars() {
        return viewedCars;
    }

    public void setViewedCars(List<Integer> viewedCars) {
        this.viewedCars = viewedCars;
    }

    public Date getDecisionTime() {
        return decisionTime;
    }

    public void setDecisionTime(Date decisionTime) {
        this.decisionTime = decisionTime;
    }
}
