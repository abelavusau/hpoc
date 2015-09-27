package com.abelavusau.restfulapi.dao;

import java.util.List;

import com.abelavusau.restfulapi.domain.SalesDO;

public interface SalesDAO {
	List<SalesDO> getSales(List<Long> leadIds);
}
