package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class C {
	
	// 다른 패키지에 있는 c는 A의 protected 필드 생성자 메소드에 접근할 수 없음. 
	public void method() {
	//	A a  = new A();
	//	a.field = "Value";
	//	a.method();
	}
	
	// 다른 패키지 이지만 상속관계인 D는 import를 하여 A를 클래스에 있는 생성자 호출 가능.
	public class D extends A{
		// 생성자 선언
		public D() {
			//A()생성자 호출
			super();
		}
		
		public void method1() {
			this.field = "Value";
			this.method();
		}
		
	}
	
}
