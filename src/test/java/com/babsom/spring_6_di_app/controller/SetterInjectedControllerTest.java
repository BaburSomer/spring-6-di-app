package com.babsom.spring_6_di_app.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SetterInjectedControllerTest {

	@Autowired
	SetterInjectedController controller;

//	@BeforeEach
//	void setUp() throws Exception {
//		controller = new SetterInjectedController();
//		controller.setGreetingService(new GreetingServiceImpl());
//	}

	@Test
	void testSayGreeting() {
		System.out.println(controller.sayGreeting());
	}

}
