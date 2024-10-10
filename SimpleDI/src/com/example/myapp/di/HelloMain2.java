package com.example.myapp.di;

public class HelloMain2 {

	public static void main(String[] args) {
		IHelloService helloService = new HelloService();			//빈 생성
		HelloController2 controller = new HelloController2(helloService);	//생성자(Constructor) 의존성 주입(Dependency Injection)
		controller.hello("홍길동");
	}
}