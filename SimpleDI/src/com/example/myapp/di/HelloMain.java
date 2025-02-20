package com.example.myapp.di;

public class HelloMain {

	public static void main(String[] args) {
		// HelloController 클래스의 hello() 메서드를 호출
		// HelloController -> HelloService
		// HelloController가 HelloService에 의존한다.
		// 자바에서 인터페이스가 사용하는 이유: 기능 명세, 기능 표준화, 구현 클래스의 다형성을 활용
		HelloController controller = new HelloController();	//DI를 주입하지 않고 진행
		controller.hello("홍길동");
	}
}