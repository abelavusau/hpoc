package com.abelavusau.restfulapi.model;

import java.io.Serializable;
import java.util.Date;

public class Carcode implements Serializable {

    private String carCodeId;
    private Long partnerLeadId;
    private Long cddLocationId;
    private Long cddDealerId;
    private Long ccMessageId;
    private Long ccReplyId;
    private String messageType;
    private Long ccSalesPersonId;
    private String name;
    private String body;
    private String state;
    private Long stopRequested;
    private Long startRequested;
    private Long fromNum;
    private Long toNum;
    private String phoneLabel;
    private Date createdTime;
    private Date repliedTime;
    private Date updatedTime;
    private Date failedTime;
    private Date readTime;
    private String providerMsg;
    private String requestId;
    private Long vehicleId;
    private String uploadId;
    private Long crediTappId;
    private String pricePromiseUrl;
    private Boolean isAuto;
    private Date processDatetime;
    private String conversationType;
    private Boolean customerInitiated;


    public String getCarCodeId() {
        return carCodeId;
    }

    public void setCarCodeId(String carCodeId) {
        this.carCodeId = carCodeId;
    }

    public Long getPartnerLeadId() {
        return partnerLeadId;
    }

    public void setPartnerLeadId(Long partnerLeadId) {
        this.partnerLeadId = partnerLeadId;
    }

    public Long getCddLocationId() {
        return cddLocationId;
    }

    public void setCddLocationId(Long cddLocationId) {
        this.cddLocationId = cddLocationId;
    }

    public Long getCddDealerId() {
        return cddDealerId;
    }

    public void setCddDealerId(Long cddDealerId) {
        this.cddDealerId = cddDealerId;
    }

    public Long getCcMessageId() {
        return ccMessageId;
    }

    public void setCcMessageId(Long ccMessageId) {
        this.ccMessageId = ccMessageId;
    }

    public Long getCcReplyId() {
        return ccReplyId;
    }

    public void setCcReplyId(Long ccReplyId) {
        this.ccReplyId = ccReplyId;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public Long getCcSalesPersonId() {
        return ccSalesPersonId;
    }

    public void setCcSalesPersonId(Long ccSalesPersonId) {
        this.ccSalesPersonId = ccSalesPersonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getStopRequested() {
        return stopRequested;
    }

    public void setStopRequested(Long stopRequested) {
        this.stopRequested = stopRequested;
    }

    public Long getStartRequested() {
        return startRequested;
    }

    public void setStartRequested(Long startRequested) {
        this.startRequested = startRequested;
    }

    public Long getFromNum() {
        return fromNum;
    }

    public void setFromNum(Long fromNum) {
        this.fromNum = fromNum;
    }

    public Long getToNum() {
        return toNum;
    }

    public void setToNum(Long toNum) {
        this.toNum = toNum;
    }

    public String getPhoneLabel() {
        return phoneLabel;
    }

    public void setPhoneLabel(String phoneLabel) {
        this.phoneLabel = phoneLabel;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getRepliedTime() {
        return repliedTime;
    }

    public void setRepliedTime(Date repliedTime) {
        this.repliedTime = repliedTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Date getFailedTime() {
        return failedTime;
    }

    public void setFailedTime(Date failedTime) {
        this.failedTime = failedTime;
    }

    public Date getReadTime() {
        return readTime;
    }

    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }

    public String getProviderMsg() {
        return providerMsg;
    }

    public void setProviderMsg(String providerMsg) {
        this.providerMsg = providerMsg;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getUploadId() {
        return uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    public Long getCrediTappId() {
        return crediTappId;
    }

    public void setCrediTappId(Long crediTappId) {
        this.crediTappId = crediTappId;
    }

    public String getPricePromiseUrl() {
        return pricePromiseUrl;
    }

    public void setPricePromiseUrl(String pricePromiseUrl) {
        this.pricePromiseUrl = pricePromiseUrl;
    }

    public Boolean getIsAuto() {
        return isAuto;
    }

    public void setIsAuto(Boolean isAuto) {
        this.isAuto = isAuto;
    }

    public Date getProcessDatetime() {
        return processDatetime;
    }

    public void setProcessDatetime(Date processDatetime) {
        this.processDatetime = processDatetime;
    }

    public String getConversationType() {
        return conversationType;
    }

    public void setConversationType(String conversationType) {
        this.conversationType = conversationType;
    }

    public Boolean getCustomerInitiated() {
        return customerInitiated;
    }

    public void setCustomerInitiated(Boolean customerInitiated) {
        this.customerInitiated = customerInitiated;
    }
}
