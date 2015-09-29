package com.a3m.model;


import java.io.Serializable;

public class SmallLeadModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String vehicleMake;
    private int vehicleYear;
    private Boolean pricePromise;
    private Float offerPrice;
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

    public Float getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(Float offerPrice) {
        this.offerPrice = offerPrice;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
