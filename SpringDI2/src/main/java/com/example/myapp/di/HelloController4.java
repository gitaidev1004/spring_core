package com.example.myapp.di;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController4 {
	
	@Inject
	IHelloService helloService;

	public void hello(String name) {
		String result = helloService.sayHello(name);
		System.out.println(result);
	}
}
