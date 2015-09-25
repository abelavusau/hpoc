package com.abelavusau.restfulapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abelavusau.restfulapi.dao.ResourceDAO;

@RestController
public class ResourceController {
	@Autowired
	private ResourceDAO resourceDAO;
	
	@RequestMapping("/resources")
	public void getResource() {
		System.out.println("GET resourses");
	}
}
