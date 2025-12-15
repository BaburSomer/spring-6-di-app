package com.babsom.spring_6_di_app.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.babsom.spring_6_di_app.service.GreetingService;

@Controller
public class I18nController {
	private final GreetingService service;

	public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
		super();
		this.service = greetingService;
	}

	public String sayHelloInI18n() {
		return service.sayGreeting();
	}
}
