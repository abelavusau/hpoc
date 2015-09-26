package com.abelavusau.restfulapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abelavusau.restfulapi.dao.LeadVODao;
import com.abelavusau.restfulapi.vo.LeadVO;

@RestController
public class ResourceController {
	@Autowired
	private LeadVODao leadVODao;

	@RequestMapping("/resources")
	public ResponseEntity<List<LeadVO>> getLeads() {
		ResponseEntity<List<LeadVO>> responseEntity = new ResponseEntity<List<LeadVO>>(leadVODao.getAll(),
				HttpStatus.OK);
		return responseEntity;
	}
}
