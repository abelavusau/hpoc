package com.a3m.dao;

import java.util.List;

import com.a3m.domain.SalesDO;

public interface SalesDAO {
	List<SalesDO> getSales(List<Long> leadIds);
}
