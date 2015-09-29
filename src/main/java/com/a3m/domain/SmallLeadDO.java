package com.a3m.domain;

public class SmallLeadDO {
    private String vehicleMake;
    private Integer vehicleYear;
    private Boolean pricePromiseFlag;
    private Float offerPrice;

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
        return pricePromiseFlag;
    }

    public void setPricePromise(Boolean pricePromiseFlag) {
        this.pricePromiseFlag = pricePromiseFlag;
    }

    public Float getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(Float offerPrice) {
        this.offerPrice = offerPrice;
    }
}
