package ch08.sec05;

//인터페이스에서는 완전한 실행 코드를 가진 디폴트 메소드를 선언할 수 있다. 
//default 키워드가 리턴 타입 앞에 붙는다.
//default 메소드의 실행부에는 상수 필드를 읽거나 추상 메서드를 호출하는 코드를 작성할 수있다. 

//구현 클래스는 디폴트 메소드를 재정의해서 자신에게 맞게 수정할 수도 있다.
//재정의 시 주의할 점은 public 접근 제한자를 붙여야 하고 default 키워드를 생략해야한다. 

public class Audio implements RemoteControl{
	
	private int volume;
	
	@Override
	public void trunOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void trunOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
	
	private int memoryVolume;
	
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
			setVolume(this.memoryVolume);
		}
	}
	
	

}
