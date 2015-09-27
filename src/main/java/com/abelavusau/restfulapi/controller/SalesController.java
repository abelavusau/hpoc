package com.abelavusau.restfulapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abelavusau.restfulapi.dao.SalesDAO;
import com.abelavusau.restfulapi.model.Sales;

@RestController
public class SalesController {
	@Autowired
	private SalesDAO salesDAO;

	@RequestMapping(value = "/sales/{leadId}", method = RequestMethod.GET)
	public List<Sales> getSales(@PathVariable long leadId) {
		List<Long> input = new ArrayList<>(1);
		input.add(leadId);
		return salesDAO.getSales(input);
	}
}
