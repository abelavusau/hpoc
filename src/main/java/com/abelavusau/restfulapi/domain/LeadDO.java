package com.abelavusau.restfulapi.domain;

import java.io.Serializable;
import java.util.Date;

public class LeadDO implements Serializable {

    private Long leadId;
    private Date leadDate;
    private String leadTime;
    private Long userEventGuidTimestamp;
    private String visitorId;
    private Long visitorKey;
    private String sessionId;
    private String ip;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private String customerPhoneNumber;
    private String customerAddressStreet;
    private String customerAddressCity;
    private String customerAddressState;
    private String customerAddressZip;
    private String customerAddressDma;
    private String vehicleVin;
    private String vehicleYear;
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleStyle;
    private String vehicleMakeId;
    private String vehicleModelLinkCode;
    private String vehicleModelYearId;
    private Long vehicleKey;
    private String contractName;
    private Long contractId;
    private String contractReportType;
    private String contractApplicationType;
    private String dealerLineItemId;
    private String dealerFranchiseId;
    private String dealerLocationId;
    private String dealerDistance;
    private String inventoryId;
    private String statusCode;
    private Short statusId;
    private String programCode;
    private String confirmedFlag;
    private String internalFlag;
    private String pricePromiseFlag;
    private String responseMessage;
    private String referringUrl;
    private String leadType;
    private String leadComment;
    private String syndicationPartner;
    private String offerPrice;
    private String leadAttributeKeyValuePair;
    private String programLeadType;
    private Long partnerLeadId;

    public Long getLeadId() {
        return leadId;
    }

    public void setLeadId(Long leadId) {
        this.leadId = leadId;
    }

    public Date getLeadDate() {
        return leadDate;
    }

    public void setLeadDate(Date leadDate) {
        this.leadDate = leadDate;
    }

    public String getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(String leadTime) {
        this.leadTime = leadTime;
    }

    public Long getUserEventGuidTimestamp() {
        return userEventGuidTimestamp;
    }

    public void setUserEventGuidTimestamp(Long userEventGuidTimestamp) {
        this.userEventGuidTimestamp = userEventGuidTimestamp;
    }

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public Long getVisitorKey() {
        return visitorKey;
    }

    public void setVisitorKey(Long visitorKey) {
        this.visitorKey = visitorKey;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerAddressStreet() {
        return customerAddressStreet;
    }

    public void setCustomerAddressStreet(String customerAddressStreet) {
        this.customerAddressStreet = customerAddressStreet;
    }

    public String getCustomerAddressCity() {
        return customerAddressCity;
    }

    public void setCustomerAddressCity(String customerAddressCity) {
        this.customerAddressCity = customerAddressCity;
    }

    public String getCustomerAddressState() {
        return customerAddressState;
    }

    public void setCustomerAddressState(String customerAddressState) {
        this.customerAddressState = customerAddressState;
    }

    public String getCustomerAddressZip() {
        return customerAddressZip;
    }

    public void setCustomerAddressZip(String customerAddressZip) {
        this.customerAddressZip = customerAddressZip;
    }

    public String getCustomerAddressDma() {
        return customerAddressDma;
    }

    public void setCustomerAddressDma(String customerAddressDma) {
        this.customerAddressDma = customerAddressDma;
    }

    public String getVehicleVin() {
        return vehicleVin;
    }

    public void setVehicleVin(String vehicleVin) {
        this.vehicleVin = vehicleVin;
    }

    public String getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(String vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleStyle() {
        return vehicleStyle;
    }

    public void setVehicleStyle(String vehicleStyle) {
        this.vehicleStyle = vehicleStyle;
    }

    public String getVehicleMakeId() {
        return vehicleMakeId;
    }

    public void setVehicleMakeId(String vehicleMakeId) {
        this.vehicleMakeId = vehicleMakeId;
    }

    public String getVehicleModelLinkCode() {
        return vehicleModelLinkCode;
    }

    public void setVehicleModelLinkCode(String vehicleModelLinkCode) {
        this.vehicleModelLinkCode = vehicleModelLinkCode;
    }

    public String getVehicleModelYearId() {
        return vehicleModelYearId;
    }

    public void setVehicleModelYearId(String vehicleModelYearId) {
        this.vehicleModelYearId = vehicleModelYearId;
    }

    public Long getVehicleKey() {
        return vehicleKey;
    }

    public void setVehicleKey(Long vehicleKey) {
        this.vehicleKey = vehicleKey;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public String getContractReportType() {
        return contractReportType;
    }

    public void setContractReportType(String contractReportType) {
        this.contractReportType = contractReportType;
    }

    public String getContractApplicationType() {
        return contractApplicationType;
    }

    public void setContractApplicationType(String contractApplicationType) {
        this.contractApplicationType = contractApplicationType;
    }

    public String getDealerLineItemId() {
        return dealerLineItemId;
    }

    public void setDealerLineItemId(String dealerLineItemId) {
        this.dealerLineItemId = dealerLineItemId;
    }

    public String getDealerFranchiseId() {
        return dealerFranchiseId;
    }

    public void setDealerFranchiseId(String dealerFranchiseId) {
        this.dealerFranchiseId = dealerFranchiseId;
    }

    public String getDealerLocationId() {
        return dealerLocationId;
    }

    public void setDealerLocationId(String dealerLocationId) {
        this.dealerLocationId = dealerLocationId;
    }

    public String getDealerDistance() {
        return dealerDistance;
    }

    public void setDealerDistance(String dealerDistance) {
        this.dealerDistance = dealerDistance;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Short getStatusId() {
        return statusId;
    }

    public void setStatusId(Short statusId) {
        this.statusId = statusId;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getConfirmedFlag() {
        return confirmedFlag;
    }

    public void setConfirmedFlag(String confirmedFlag) {
        this.confirmedFlag = confirmedFlag;
    }

    public String getInternalFlag() {
        return internalFlag;
    }

    public void setInternalFlag(String internalFlag) {
        this.internalFlag = internalFlag;
    }

    public String getPricePromiseFlag() {
        return pricePromiseFlag;
    }

    public void setPricePromiseFlag(String pricePromiseFlag) {
        this.pricePromiseFlag = pricePromiseFlag;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getReferringUrl() {
        return referringUrl;
    }

    public void setReferringUrl(String referringUrl) {
        this.referringUrl = referringUrl;
    }

    public String getLeadType() {
        return leadType;
    }

    public void setLeadType(String leadType) {
        this.leadType = leadType;
    }

    public String getLeadComment() {
        return leadComment;
    }

    public void setLeadComment(String leadComment) {
        this.leadComment = leadComment;
    }

    public String getSyndicationPartner() {
        return syndicationPartner;
    }

    public void setSyndicationPartner(String syndicationPartner) {
        this.syndicationPartner = syndicationPartner;
    }

    public String getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(String offerPrice) {
        this.offerPrice = offerPrice;
    }

    public String getLeadAttributeKeyValuePair() {
        return leadAttributeKeyValuePair;
    }

    public void setLeadAttributeKeyValuePair(String leadAttributeKeyValuePair) {
        this.leadAttributeKeyValuePair = leadAttributeKeyValuePair;
    }

    public String getProgramLeadType() {
        return programLeadType;
    }

    public void setProgramLeadType(String programLeadType) {
        this.programLeadType = programLeadType;
    }

    public Long getPartnerLeadId() {
        return partnerLeadId;
    }

    public void setPartnerLeadId(Long partnerLeadId) {
        this.partnerLeadId = partnerLeadId;
    }
}
