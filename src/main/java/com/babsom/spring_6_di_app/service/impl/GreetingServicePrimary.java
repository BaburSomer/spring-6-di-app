package com.babsom.spring_6_di_app.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.babsom.spring_6_di_app.service.GreetingService;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello Everyone from Primary Bean";
	}

}
