package com.abelavusau.restfulapi.service;

import java.util.List;

import com.abelavusau.restfulapi.model.SalesModel;

public interface SalesService {
    List<SalesModel> getSales(List<Long> leadIds);
}
