package sub3;

public class Calc {
	
	//싱글톤 객체------
	// static으로 자기 자신을 정의
	// getter
	// return
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	//new 생성자를 생성하지 못하도록
	private Calc() {
		
	}
	//-----------------
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
	
	
}
