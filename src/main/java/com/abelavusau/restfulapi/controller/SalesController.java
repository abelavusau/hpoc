package com.abelavusau.restfulapi.controller;

import java.util.ArrayList;
import java.util.List;

import com.abelavusau.restfulapi.model.SalesModel;
import com.abelavusau.restfulapi.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController {
	@Autowired
	private SalesService salesService;

	@RequestMapping(value = "/sales/{leadId}", method = RequestMethod.GET)
	public List<SalesModel> getSales(@PathVariable long leadId) {
		List<Long> input = new ArrayList<>(1);
		input.add(leadId);
		return salesService.getSales(input);
	}
}
