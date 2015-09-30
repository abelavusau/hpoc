package com.a3m.model;


public enum  DistanceRange {

    TEN(10),
    TWENRY_FIVE(25),
    FIFTY(50),
    SEVENTY_FIVE(75),
    ONE_HUNDRED(100);


    private final long to;

    private DistanceRange(long to) {
        this.to = to;
    }

    public long getTo() {
        return to;
    }

}
