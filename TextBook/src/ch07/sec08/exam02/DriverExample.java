package ch07.sec08.exam02;

//매개변수의 다형성
//다형성은 필드보다 메소드를 호출할 때 많이 발생한다. 메소드가 클래스 타입의 매개변수를 가지고 있을 경우,
//호출할 때 동일한 타입의 객체를 제공하는 것이 정석이지만 자식 객체를 제공할 수도 있다.
public class DriverExample {
	public static void main(String[] args) {
		
		//Driver 객체 생성
		Driver driver = new Driver();
		
		//매개값으로 Bus 객체를 제공하고 driver()메소드 호출
		Bus bus = new Bus();
		driver.drive(bus);
		
		//매개값으로 Taxi 객체를 제공하고 driver() 메소드 호출
		Taxi taxi = new Taxi();
		//drive() 메소드는 매개변수 vehicle이 참조하는 객체의 run()메소드를 호출하는데
		// 자식 객체가 run() 메소드를 재정의 하고 있다면 재정의 된 run() 메소드가 호츨된다. 
		driver.drive(taxi);
	
	}
}
