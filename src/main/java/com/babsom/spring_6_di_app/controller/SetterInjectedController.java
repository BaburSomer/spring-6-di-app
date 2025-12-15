package com.babsom.spring_6_di_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.babsom.spring_6_di_app.service.GreetingService;

@Controller
public class SetterInjectedController {
	private GreetingService service;

	public String sayGreeting() {
		return service.sayGreeting();
	}
	
	@Autowired
	public void setGreetingService(GreetingService service) {
		System.out.println("SetterInjectedController");
		this.service = service;
	}
}    