package ch07.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		
		SupersonicAriplane sa = new SupersonicAriplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode = SupersonicAriplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAriplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
