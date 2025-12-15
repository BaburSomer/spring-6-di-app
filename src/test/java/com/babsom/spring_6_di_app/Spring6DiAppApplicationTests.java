package com.babsom.spring_6_di_app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.babsom.spring_6_di_app.controller.MyController;

@SpringBootTest
class Spring6DiAppApplicationTests {
	@Autowired
	ApplicationContext ctx;
	@Autowired
	MyController myController;
	
	@Test
	void contextLoads() {
	}

	@Test
	void testAutoWiredControllerCtx() {
		System.out.println(myController.sayHello());
	}
	
	@Test
	void testGetControllerCtx() {
		MyController       controller = ctx.getBean(MyController.class);
		System.out.println(controller.sayHello());
	}
}
