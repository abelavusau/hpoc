package com.abelavusau.restfulapi.vo;

public class LeadVO {
	private Long leadId;
	private String sessionId;
	private String dealerDistance;
	private String pricePromiseFlag;

	public Long getLeadId() {
		return leadId;
	}

	public void setLeadId(Long leadId) {
		this.leadId = leadId;
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
}
