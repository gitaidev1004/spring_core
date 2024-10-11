package com.example.myapp.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.myapp.config.AppConfig;

public class HelloMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);	 
		HelloController controller = context.getBean("helloController", HelloController.class);		//DI 없이 실행
		controller.hello("Configuration~DI~!");
		context.destroy();
	}
}