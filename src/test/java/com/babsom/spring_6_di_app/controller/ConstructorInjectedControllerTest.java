package com.babsom.spring_6_di_app.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConstructorInjectedControllerTest {

	@Autowired
	ConstructorInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSayGreeting() {
		System.out.println(controller.sayGreeting());
	}

}
