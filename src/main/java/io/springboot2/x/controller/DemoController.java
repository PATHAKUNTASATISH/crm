package io.springboot2.x.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.springboot2.x.service.DemoService;
@RestController
public class DemoController {
	
	
	
	@Autowired
	DemoService service;
	
	@GetMapping("/hi")
	public String getHello() {
		return service.sayHi();
	}
	
	@GetMapping("/bye")
	public String getBye() {
		return service.sayBye();
	}
	
	
	
	

}
