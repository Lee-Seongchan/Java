package ch07.sec06.package1;

// 같은 패키지 안에 있는 A와 B 클래스는 protedcted 필드, 생성자, 메소드에 접근이 가능하다.
public class B {
	
	//메서드 선언
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
