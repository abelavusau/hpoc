package com.a3m.model;

public class LeadCriteria {

    public static int DEFAULT_YEAR_DELTA = 2;
    public static Double DEFAULT_OFFER_PRICE_DELTA = 2000.;

    private String vehicleMake;
    private int year;
    private int yearDelta;
    private Boolean pricePromise;
    private String vehicleModel;
    private Double price;
    private Double priceDelta;
    private Boolean carCode;

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYearDelta() {
        return yearDelta;
    }

    public void setYearDelta(int yearDelta) {
        this.yearDelta = yearDelta;
    }

    public boolean isPricePromise() {
        return pricePromise;
    }

    public void setPricePromise(boolean pricePromise) {
        this.pricePromise = pricePromise;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getCarCode() {
        return carCode;
    }

    public void setCarCode(Boolean carCode) {
        this.carCode = carCode;
    }

    public Double getPriceDelta() {
        return priceDelta;
    }

    public void setPriceDelta(Double priceDelta) {
        this.priceDelta = priceDelta;
    }
}
