package com.a3m.service.impl;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.a3m.dao.DistanceDao;
import com.a3m.model.DistanceMetric;
import com.a3m.model.DistanceRange;
import com.a3m.service.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceImpl implements DistanceService {

    @Autowired
    private DistanceDao distanceDao;

    @Override
    public List<DistanceMetric> getDistanceMetrics() {

        List<DistanceMetric> metrics = new ArrayList<>();
        Double totalDistances = Double.valueOf(distanceDao.getDistanceValuesTotal());
        if (BigDecimal.ZERO.equals(totalDistances)) {
            return Collections.<DistanceMetric>emptyList();
        }

        for(DistanceRange range : DistanceRange.values()) {
            DistanceMetric metric = new DistanceMetric();
            metric.setDistance(range.getTo());
            Long distances = distanceDao.getDistancesFromInterval(range.getTo());
            metric.setValue(Double.valueOf(distances) / totalDistances);
            metrics.add(metric);
        }

        return metrics;
    }
}
