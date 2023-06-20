package sub3;

/**
 * 
 * 날짜 : 2023/06/20
 * 이름 : 이성찬
 * 내용 : JAVA 변수, 클래스 메서드 실습하기
 * 
 * 
 */
class Increment{
	private int num1;
	public static int num2;
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);
	}
	
}

public class StaticTest {
	public static void main(String[] args) {
		
		
		//Increment실습
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		
		Car sonata = new Car("소나타", "흰색", 10);
		Car avante = new Car("아반테", "검정", 20);
		Car grande = new Car("그랜져", "남색", 30);
		
		sonata.show(); //멤버 메서드
		avante.show();
		grande.show();
		
		//클래스 타입으로 참조가능한 것은 static 
 
		// 클래스 변수 참조하여 호출
		System.out.println("전체 차량 수 : " + Car.count);
		// 클래스 메서드 참조하여 호출
		System.out.println("현재 차량수 : " + Car.getCount());
		
		
		//싱글톤 객체 실습
		// 싱글콘 : 메모리 상에 오직하나의 인스턴스로 생성되는 객체 
		//Calc cl = new Calc(); -> 생성안됨
		
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		
		int result1 = c1.plus(1, 2);
		int result2 = c2.minus(1, 2);
		
		System.out.println("result1 :" + result1);
		System.out.println("result2 :" + result2);
		
	}
}
