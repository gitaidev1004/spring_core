package com.example.myapp.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain2 {
	public static void main(String[] args) {
		//AbstractApplicationContext는 자바 클래스가 아닌 다른 파일의 내용을 불러오는 추상체
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");	 
		HelloController2 controller = context.getBean("helloController2", HelloController2.class);	//생성자를 활용한 DI
		controller.hello("나는 너를 좋아하니~?");
		context.close();
	}
}