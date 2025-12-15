package com.babsom.spring_6_di_app.service.impl;

import org.springframework.stereotype.Service;

import com.babsom.spring_6_di_app.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		System.out.println("In GreetingService");
		return "Hello Everyone from Service";
	}

}
