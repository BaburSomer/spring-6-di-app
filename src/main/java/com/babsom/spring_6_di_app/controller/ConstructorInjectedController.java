package com.babsom.spring_6_di_app.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.babsom.spring_6_di_app.service.GreetingService;

@Controller
public class ConstructorInjectedController {
	private final GreetingService service;

	public ConstructorInjectedController(@Qualifier("greetingServiceImpl")  GreetingService greetingService) {
		super();
		this.service = greetingService;
	}

	public String sayGreeting() {
		return service.sayGreeting();
	}
}       