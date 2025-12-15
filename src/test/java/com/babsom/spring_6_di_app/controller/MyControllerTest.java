package com.babsom.spring_6_di_app.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MyControllerTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSayHello() {
		MyController controller = new MyController();
		System.out.println(controller.sayHello());
	}

}
