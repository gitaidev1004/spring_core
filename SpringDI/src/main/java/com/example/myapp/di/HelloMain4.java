package com.example.myapp.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain4 {
	public static void main(String[] args) {
		//AbstractApplicationContext는 자바 클래스가 아닌 다른 파일의 내용을 불러오는 추상체
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");	 
		HelloController4 controller = context.getBean("helloController4", HelloController4.class);	//p속성을 활용한 수정자를 활용한 DI2
		controller.hello("p를 이용한 수정자가 좋니~?");
		context.close();
	}
}