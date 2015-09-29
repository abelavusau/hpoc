package com.a3m.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class LeadStatisticsDO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String leadIds;
    private String sessionId;
    private String dealerDistance;
    private String pricePromiseFlag;
    private Long leadTypeId;
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

    public Long getLeadTypeId() {
        return leadTypeId;
    }

    public void setLeadTypeId(Long leadTypeId) {
        this.leadTypeId = leadTypeId;
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
