package com.babsom.spring_6_di_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.babsom.spring_6_di_app.service.GreetingService;


@Controller
public class PropertyInjectedController {
	
	@Qualifier("propertyGreetingService")
//	@Qualifier("greetingServicePropertyInjected") bean'e isim verirsen yukardaki gibi, defaıult name'i kullanırsan bunun gibi
	@Autowired
	public GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}