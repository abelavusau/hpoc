package com.abelavusau.restfulapi.controller;

import java.util.List;

import com.abelavusau.restfulapi.model.LeadStatisticsModel;
import com.abelavusau.restfulapi.service.LeadService;
import com.abelavusau.restfulapi.service.SalesService;
import com.abelavusau.restfulapi.vo.LeadStatisticsVO;
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
		List<LeadStatisticsVO> statistics = (List<LeadStatisticsVO>)conversionService.convert(leadStatisticsModel,
				TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(LeadStatisticsModel.class)),
				TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(LeadStatisticsVO.class)));

		return statistics;

	}
}
