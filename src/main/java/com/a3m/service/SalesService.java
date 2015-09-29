package com.a3m.service;

import java.util.List;

import com.a3m.model.SalesModel;

public interface SalesService {
    List<SalesModel> getSales(List<Long> leadIds);
    void updateSalesToMatchLeads(int successPercentage);
}
