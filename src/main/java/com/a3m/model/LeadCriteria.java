package com.a3m.model;

public class LeadCriteria {

    public static int DEFAULT_YEAR_DELTA = 2;

    private String vehicleMake;
    private int year;
    private int yearDelta;
    private boolean pricePromise;
    private String vehicleModel;

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
}
