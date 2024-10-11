package com.example.myapp.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.myapp.config.AppConfig;

public class HelloMain2 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);	 
		HelloController2 controller = context.getBean("helloController2", HelloController2.class);		//Constructor DI
		controller.hello("Configuration~Constructor~DI~!");
		context.destroy();
	}
}