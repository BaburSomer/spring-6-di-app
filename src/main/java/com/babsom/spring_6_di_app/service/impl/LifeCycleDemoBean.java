package com.babsom.spring_6_di_app.service.impl;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.babsom.spring_6_di_app.controller.MyController;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor {

	private String javaVer;
	
	public LifeCycleDemoBean() {
		super();
		System.out.println("## I'm in the LifeCycleDemoBean constructor");
	}

	@Value("${java.specification.version}")
	public void setJavaVer(String javaVer) {
		this.javaVer = javaVer;
		System.out.println("## 1 Properties set. Java Ver.: " + this.javaVer);
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("## 4 Application context has been set");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("## 3 Bean factory has been set to " + beanFactory.toString());
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("## 2 Bean name has been set to " + name);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("## 8 The lifecycle bean has been terminated");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("## 6 The lifecycle bean has its properties set");
	}
	
	@PostConstruct
	public void postConstruct () {
		System.out.println("## 5 The PostConstruct annotated method has been called");
	}
	  
	@PreDestroy
	public void preDestroy () {
		System.out.println("## 7 The PreDestroy annotated method has been called");
	}
	
	public void beforeInit() {
		System.out.println("## Before Init called by Bean Post Processor");
	}
	
	public void afterInit() {
		System.out.println("## After Init called by Bean Post Processor");
	}

	@Override
	public @Nullable Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("## postProcessBeforeInitialization: " + beanName);
		
		if (bean instanceof MyController) {
			MyController myController = (MyController)bean;
			System.out.println("## Calling beforeInit");
			myController.beforeInit();
		}
		
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public @Nullable Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("## postProcessAfterInitialization: " + beanName);

		if (bean instanceof MyController) {
			MyController myController = (MyController)bean;
			System.out.println("## Calling afterInit");
			myController.afterInit();
		}
		
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}