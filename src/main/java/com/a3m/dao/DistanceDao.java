package com.a3m.dao;

public interface DistanceDao {

    long getDistanceValuesTotal();

    long getDistancesFromInterval(long toThreshold);

}
