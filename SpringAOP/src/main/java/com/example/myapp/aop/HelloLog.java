package com.example.myapp.aop;

import org.springframework.stereotype.Component;

@Component
public class HelloLog {	//공통 코드
	public void log() {
		System.out.println("***************************************");
		System.out.println(">>>LOG<<< : "+ new java.util.Date());
		System.out.println("***************************************");
	}
}
