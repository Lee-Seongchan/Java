package ch08.sec04;

public class Aution implements RemoteContol{

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
		if(volume > RemoteContol.MAX_VOLUME) {
			this.volume = RemoteContol.MAX_VOLUME;
		}else if(volume < RemoteContol.MIN_VOLUME) {
			this.volume = RemoteContol.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}

}
