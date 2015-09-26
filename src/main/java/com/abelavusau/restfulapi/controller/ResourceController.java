package com.abelavusau.restfulapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	@RequestMapping("/resources")
	public void getResource() {
		System.out.println("GET resourses");
	}
}
