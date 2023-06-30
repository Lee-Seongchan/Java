package sub9;

public class Cable implements Socket{
	
	// Bulb 자료형인 bulb 필드 선언
	// Bulb 클래스에서 private,protected 제외한 public과 default 자료형 사용가능 
	// 클래스를 자료형으로 선언하면 해당 클래스를 여러 곳에서 재사용 가능.
	// 클래스는 객체의 공통된 특성과 동작을 정의하므로 필요한 경우 클래스를 복제하거나 상속받아 새로운 객체 생성
	// 이는 코드의 재사용성과 생산성을 높이는 데 도움이 됩니다.
	private Bulb bulb;
	
	// Cable 객체의 생성자는 bulb를 매개변수로 가지면서 초기화 시킴
	// ->Cable 객체를 생성하면 전달된 bulb 객체가 Cable 클래스의 bulb 멤버 변수에 연결 
	// 이후에 Cable 객체를 통해 해당 bulb 멤버 변수에 접근하고 활용
	public Cable(Bulb bulb) {
		this.bulb = bulb;
	}
	
	@Override
	public void switchOn() {
		bulb.lightOn();
	}

	@Override
	public void switchOff() {
		bulb.lightOff();
	}

}
