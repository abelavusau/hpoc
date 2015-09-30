package com.a3m.controller;

import java.util.ArrayList;
import java.util.List;

import com.a3m.controller.converter.ResourceNotFoundException;
import com.a3m.model.SmallLeadModel;
import com.a3m.service.SmallLeadsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.a3m.model.LeadStatisticsModel;
import com.a3m.service.LeadService;
import com.a3m.service.SalesService;
import com.a3m.vo.LeadStatisticsVO;

@RestController
public class LeadsController extends AbstractRestController {
	@Autowired
	private LeadService leadService;

	@Autowired
	private SalesService salesService;

	@Autowired
	private SmallLeadsService smallLeadsService;

	@Autowired
	private ConversionService conversionService;

	@RequestMapping("/leads")
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
//
//	@RequestMapping("/leads/{id}")
//	public LeadStatisticsVO getLeadById(@PathVariable("id") Long id) {
//		LeadStatisticsModel leadStatisticsModel = leadService.findById(id);
//
//		if (leadStatisticsModel == null) {
//			throw new ResourceNotFoundException();
//		}
//
//		List<LeadStatisticsVO> result = new ArrayList<>();
//		LeadStatisticsVO statisticsVO = conversionService.convert(leadStatisticsModel, LeadStatisticsVO.class);
//		statisticsVO.setSales(salesService.getSales(leadStatisticsModel.getLeadIds()));
//		return statisticsVO;
//	}


	@RequestMapping("/lead/{id}")
	public SmallLeadModel getLeadById(@PathVariable("id") Long id,
                                      @RequestParam(value = "price", required = false) Double price,
                                      @RequestParam(value = "pricePromise", required = false) Boolean pricePromise,
                                      @RequestParam(value = "carcode", required = false) Boolean carCode) {
		SmallLeadModel model  = smallLeadsService.findById(id, price, pricePromise, carCode);

		if (model == null) {
			throw new ResourceNotFoundException();
		}
		return model;


	}


}
