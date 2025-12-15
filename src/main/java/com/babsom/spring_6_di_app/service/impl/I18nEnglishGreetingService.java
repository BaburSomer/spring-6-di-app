package com.babsom.spring_6_di_app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.babsom.spring_6_di_app.service.GreetingService;

@Profile("EN")
@Service("i18nService")
// DİKKAT: Config sınıfında farklı kullandı bu bilgileri
public class I18nEnglishGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
//		return englishGreetingRepository.getGreeting();
		return "Hi dear!";
	}

//	public EnglishGreetingRepository getEnglishGreetingRepository() {
//		return englishGreetingRepository;
//	}
}