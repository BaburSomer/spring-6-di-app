package com.babsom.spring_6_di_app.service.impl;

import org.springframework.stereotype.Service;

import com.babsom.spring_6_di_app.service.GreetingService;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello Everyone from PropertyInjected Bean";
	}

}
