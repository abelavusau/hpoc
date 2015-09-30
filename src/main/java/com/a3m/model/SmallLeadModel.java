package com.a3m.model;


import java.io.Serializable;

public class SmallLeadModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String vehicleMake;
    private String vehicleModel;
    private int vehicleYear;
    private Boolean pricePromise;
    private Boolean carCode;
    private Double offerPrice;
    private Double trueMarketValue;
    private Double rate;

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public int getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(int vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public Boolean isPricePromise() {
        return pricePromise;
    }

    public void setPricePromise(Boolean pricePromise) {
        this.pricePromise = pricePromise;
    }

    public Double getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(Double offerPrice) {
        this.offerPrice = offerPrice;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public Boolean getCarCode() {
        return carCode;
    }

    public void setCarCode(Boolean carCode) {
        this.carCode = carCode;
    }

    public Double getTrueMarketValue() {
        return trueMarketValue;
    }

    public void setTrueMarketValue(Double trueMarketValue) {
        this.trueMarketValue = trueMarketValue;
    }
}
