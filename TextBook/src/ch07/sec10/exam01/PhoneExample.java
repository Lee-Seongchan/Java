package ch07.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		
		// Phone star = new Phone(); 
		// -> 추상 클래스는 new 연산자를 이용해서 객체를 직접 만들지 못하고 상속을 통해 자식 클래스만 
	    //    만들 수 있다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnoff();		
		
	}
}
