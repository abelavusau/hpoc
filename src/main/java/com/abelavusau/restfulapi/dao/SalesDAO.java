package com.abelavusau.restfulapi.dao;

import java.util.List;

import com.abelavusau.restfulapi.model.Sales;

public interface SalesDAO {
	List<Sales> getSales(List<Long> leadIds);
}
