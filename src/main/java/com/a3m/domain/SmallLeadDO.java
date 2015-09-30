package com.a3m.domain;

public class SmallLeadDO {
    private String vehicleMake;
    private String vehicleModel;
    private Integer vehicleYear;
    private Boolean pricePromiseFlag;
    private Double offerPrice;

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public Integer getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(Integer vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public Boolean isPricePromise() {
        return getPricePromiseFlag();
    }

    public void setPricePromise(Boolean pricePromiseFlag) {
        this.setPricePromiseFlag(pricePromiseFlag);
    }

    public Double getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(Double offerPrice) {
        this.offerPrice = offerPrice;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public Boolean getPricePromiseFlag() {
        return pricePromiseFlag;
    }

    public void setPricePromiseFlag(Boolean pricePromiseFlag) {
        this.pricePromiseFlag = pricePromiseFlag;
    }
}
