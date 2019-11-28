package com.provide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping("hello")
	public String hello() {
		
		List<String> services = discoveryClient.getServices();
		System.out.println("=========service is running=======");
		
		return "hello this is hello provide server";
	}
}
