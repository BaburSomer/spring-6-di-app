package com.babsom.spring_6_di_app.controller;

import org.springframework.stereotype.Controller;

import com.babsom.spring_6_di_app.service.GreetingService;
import com.babsom.spring_6_di_app.service.impl.GreetingServiceImpl;

@Controller
public class MyController {
	private final GreetingService service;

	public MyController() {
		super();
		this.service = new GreetingServiceImpl();
	}
	 
	public String sayHello() {
		return service.sayGreeting();  
	}
	
	public void beforeInit() {
		System.out.println("## Before Init called by Bean Post Processor");
	}
	
	public void afterInit() {
		System.out.println("## After Init called by Bean Post Processor");
	}


}
