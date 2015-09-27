package com.abelavusau.restfulapi.controller;

import java.util.ArrayList;
import java.util.List;

import com.abelavusau.restfulapi.model.LeadStatisticsModel;
import com.abelavusau.restfulapi.model.SalesModel;
import com.abelavusau.restfulapi.service.LeadService;
import com.abelavusau.restfulapi.service.SalesService;
import com.abelavusau.restfulapi.vo.LeadStatisticsVO;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
