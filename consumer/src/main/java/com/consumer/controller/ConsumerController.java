package com.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("hello-consumer")
	public String helloConsumer() {
		String result = restTemplate.getForObject("http://provide-server/hello", String.class);
		System.out.println("=============helloConsumer============");
		return "hello consumer finish !!!" + result;
	}
}
