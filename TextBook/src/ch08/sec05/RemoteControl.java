package ch08.sec05;

// 인터페이스에서는 완전한 실행 코드를 가진 디폴트 메소드를 선언할 수 있다. 
// default 키워드가 리턴 타입 앞에 붙는다.
// default 메소드의 실행부에는 상수 필드를 읽거나 추상 메서드를 호출하는 코드를 작성할 수있다. 

// 구현 클래스는 디폴트 메소드를 재정의해서 자신에게 맞게 수정할 수도 있다.
// 재정의 시 주의할 점은 public 접근 제한자를 붙여야 하고 default 키워드를 생략해야한다. 
public interface RemoteControl {
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void trunOn();
	void trunOff();
	
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			//추상 메소드 호출하면서 상수 필드 사용 가능
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
}
