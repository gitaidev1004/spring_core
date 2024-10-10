package com.example.myapp.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
	
	@Autowired
	private IHelloService helloService;
		
	public void hello(String name) {
		String result = helloService.sayHello(name);
		System.out.println(result);
	}
}
