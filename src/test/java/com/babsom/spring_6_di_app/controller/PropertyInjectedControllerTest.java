package com.babsom.spring_6_di_app.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyInjectedControllerTest {

	@Autowired
	PropertyInjectedController controller;

//	@BeforeEach
//	void setUp() throws Exception {
//		controller                 = new PropertyInjectedController();
//		controller.greetingService = new GreetingServiceImpl();
//	}

	@Test
	void testSayHello() {
		System.out.println(controller.sayHello());
	}
}
