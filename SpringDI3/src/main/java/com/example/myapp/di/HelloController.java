package com.example.myapp.di;

public class HelloController {
	IHelloService helloService = new HelloService();

	public void hello(String name) {
		String result = helloService.sayHello(name);
		System.out.println(result);
	}
}
