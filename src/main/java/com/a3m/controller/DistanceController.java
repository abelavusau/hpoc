package com.a3m.controller;

import java.util.List;

import com.a3m.model.DistanceMetric;
import com.a3m.service.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistanceController extends AbstractRestController {

    @Autowired
    private DistanceService distanceService;

    @RequestMapping(value = "/distances", method = RequestMethod.GET)
    public List<DistanceMetric> getDistances() {
        return distanceService.getDistanceMetrics();
    }

}
