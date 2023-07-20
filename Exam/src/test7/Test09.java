package test7;


interface Tv{
	
	public abstract void turnOn();
	
	public abstract void turnOff();
	
}

public class Test09 {
	public static void main(String[] args) {
	
		Tv tv = new Tv() {
			
			@Override
			public void turnOn() {
				System.out.println("Tv를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Tv를 끕니다.");
			}
		};
		
		tv.turnOn();
		tv.turnOff();
		
	}
}