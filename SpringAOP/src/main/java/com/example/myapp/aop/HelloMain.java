package com.example.myapp.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	public static void main(String[] args) {
		//AbstractApplicationContext는 자바 클래스가 아닌 다른 파일의 내용을 불러오는 추상체
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");	 
		HelloController controller = context.getBean("helloController", HelloController.class);	
		controller.hello("AOP 실습");
		context.close();
	}
}