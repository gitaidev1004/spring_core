package com.example.myapp.di;

public class HelloMain3 {

	public static void main(String[] args) {
		IHelloService helloService = new HelloService();			//빈 생성
		HelloController3 controller = new HelloController3();	//빈 생성
		controller.setHelloService(helloService);  //수정자(Setter) 의존성 주입(Dependency Injection)
		controller.hello("홍길동");
	}
}