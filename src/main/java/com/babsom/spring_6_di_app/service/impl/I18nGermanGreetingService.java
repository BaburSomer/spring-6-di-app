package com.babsom.spring_6_di_app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.babsom.spring_6_di_app.service.GreetingService;

@Profile({"DE", "default"})
@Service("i18nService")
// ingilizce servisine bak!
public class I18nGermanGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Servuss!";
	}

}
