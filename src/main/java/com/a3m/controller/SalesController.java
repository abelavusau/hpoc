package com.a3m.controller;

import java.util.ArrayList;
import java.util.List;

import com.a3m.model.SalesModel;
import com.a3m.service.SalesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController extends AbstractRestController {
	@Autowired
	private SalesService salesService;

	@RequestMapping(value = "/sales/{leadId}", method = RequestMethod.GET)
	public List<SalesModel> getSales(@PathVariable long leadId) {
		List<Long> input = new ArrayList<>(1);
		input.add(leadId);
		return salesService.getSales(input);
	}
	
	@RequestMapping(value = "/sales/update_to_match_leads", method = RequestMethod.GET)
	public void updateSalesToMatchLeads() {
		salesService.updateSalesToMatchLeads(15);
	}
}
