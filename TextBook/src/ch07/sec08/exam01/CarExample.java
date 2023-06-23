package ch07.sec08.exam01;

public class CarExample {
	public static void main(String[] args) {
		
		// Car 클래스에 tire 필드가 존재하기 때문에
		// new 생성자를 통해 Car 인스턴스를 초기화
		Car myCar = new Car();
		
		myCar.tire = new Tire();
		myCar.run();
		
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
		
		
		
	}
}
