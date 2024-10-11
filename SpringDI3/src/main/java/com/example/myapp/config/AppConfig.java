package com.example.myapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.myapp.di.HelloController;
import com.example.myapp.di.HelloController2;
import com.example.myapp.di.HelloController3;
import com.example.myapp.di.HelloService;
import com.example.myapp.di.IHelloService;

@Configuration
public class AppConfig {

	@Bean
	IHelloService helloService() {
		return new HelloService();
	}
	
	@Bean
	HelloController helloController() {
		return new HelloController();
	}
	
	@Bean
	HelloController2 helloController2() {
		return new HelloController2(helloService());
	}
	
	@Bean
	HelloController3 helloController3() {
		HelloController3 controller = new HelloController3();
		controller.setHelloService(helloService());
		return controller; 
	}
}
