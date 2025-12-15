package com.babsom.spring_6_di_app.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("EN")
@SpringBootTest
class I18NControllerTestEN {

	@Autowired
	I18nController controller;

	@Test
	void testSayGreeting() {
		System.out.println(controller.sayHelloInI18n());
	}

}
