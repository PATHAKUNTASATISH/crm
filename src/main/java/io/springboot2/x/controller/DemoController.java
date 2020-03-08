package io.springboot2.x.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import io.springboot2.x.service.DemoService;

public class DemoController {
	
	
	
	@Autowired
	DemoService service;
	
	@GetMapping("/hello")
	public String getHello() {
		return service.sayHello();
	}
	
	@GetMapping("/bye")
	public String getBye() {
		return service.sayBye();
	}
	
	
	
	

}
