package ch08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		// 인터페이스 변수 선언
		RemoteContol rc;
		
		//Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.trunOn();
		rc.setVolume(5);
		rc.trunOff();
		
		//Aution 객체를 생성하고 인터페이스 변수에 대입
		rc = new Aution();
		rc.trunOn();
		rc.setVolume(5);
		rc.trunOff();
	}

}
