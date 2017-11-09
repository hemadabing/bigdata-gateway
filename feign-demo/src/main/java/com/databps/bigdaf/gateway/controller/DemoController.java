package com.databps.bigdaf.gateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.databps.bigdaf.gateway.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return demoService.hello(name);
	}
}
