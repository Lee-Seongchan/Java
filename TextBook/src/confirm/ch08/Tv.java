package confirm.ch08;

public class Tv implements Remcon{
	@Override
	public void powerOn() {
		System.out.println("Tv를 켭습니다.");
	}
	
	
	public static void main(String[] args) {
		Remcon r = new Tv();
		r.powerOn();
	}

}
