package com.example.myapp.jdbc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		IEmpService empService = context.getBean("empService", IEmpService.class);
		
		System.out.println("-- 사원의 수 조회");
		System.out.println(empService.getEmpCount());
		
		System.out.println("-- 103번 사원의 정보를 조회합니다.");
		System.out.println(empService.getEmpInfo(103));
		
		context.close();
	}

}
