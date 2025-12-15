package com.babsom.spring_6_di_app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.babsom.spring_6_di_app.service.GreetingService;

@Profile("TR")
@Service("i18nService")
public class I18nTurkishGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "N'ber lan!";
	}
} 