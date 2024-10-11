package com.example.myapp.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.myapp.config.AppConfig;

public class HelloMain3 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);	 
		HelloController3 controller = context.getBean("helloController3", HelloController3.class);		//Setter DI
		controller.hello("Configuration~Setter~DI~!");
		context.destroy();
	}
}