package com.example.myapp.di;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController3 {
	
	@Resource(name="niceService")
	IHelloService helloService;

	public void hello(String name) {
		String result = helloService.sayHello(name);
		System.out.println(result);
	}
}
