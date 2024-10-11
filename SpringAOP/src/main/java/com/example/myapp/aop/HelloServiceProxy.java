package com.example.myapp.aop;

public class HelloServiceProxy extends HelloService {

	@Override
	public String sayHello(String name) {
		String result = super.sayHello(name);
		return result;
	}
}