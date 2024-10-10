package com.example.myapp.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain3 {
	public static void main(String[] args) {
		//AbstractApplicationContext는 자바 클래스가 아닌 다른 파일의 내용을 불러오는 추상체
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");	 
		HelloController3 controller = context.getBean("helloController3", HelloController3.class);	//수정자를 활용한 DI
		controller.hello("수정자가 좋니~?");
		context.close();
	}
}