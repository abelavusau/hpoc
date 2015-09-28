package com.a3m.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a3m.model.LeadStatisticsModel;
import com.a3m.service.LeadService;
import com.a3m.service.SalesService;
import com.a3m.vo.LeadStatisticsVO;

@RestController
public class ResourceController {
	@Autowired
	private LeadService leadService;

	@Autowired
	private SalesService salesService;

	@Autowired
	private ConversionService conversionService;

	@RequestMapping("/resources")
	public List<LeadStatisticsVO> getLeads() {
		List<LeadStatisticsModel> leadStatisticsModel = leadService.findAll();
		List<LeadStatisticsVO> result = new ArrayList<>();
		leadStatisticsModel.forEach(lead -> {
			LeadStatisticsVO statisticsVO = conversionService.convert(lead, LeadStatisticsVO.class);
			statisticsVO.setSales(salesService.getSales(lead.getLeadIds()));
			result.add(statisticsVO);
		});
		return result;

	}
}
