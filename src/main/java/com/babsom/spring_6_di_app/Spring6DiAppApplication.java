package com.babsom.spring_6_di_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.babsom.spring_6_di_app.controller.MyController;

@SpringBootApplication
public class Spring6DiAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx        = SpringApplication.run(Spring6DiAppApplication.class, args);
		MyController       controller = ctx.getBean(MyController.class);
		System.out.println("In Main Method");
		System.out.println(controller.sayHello());
	}
}