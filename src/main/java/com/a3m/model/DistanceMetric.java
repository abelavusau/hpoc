package com.a3m.model;

import java.math.BigDecimal;

public class DistanceMetric {
    private long threshold;
    private Double value;

    public long getThreshold() {
        return threshold;
    }

    public void setThreshold(long threshold) {
        this.threshold = threshold;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
