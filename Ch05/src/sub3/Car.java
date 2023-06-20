package sub3;

public class Car {
	
	//heap에 저장
	private String name;
	private String color;
	private int speed;
	
	// 클래스 변수 (정적 변수) - method area에 저장
	public static int count;
	
	// 생성자 : 캡슐화된 속성을 초기화하기 위한 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	// 클래스 메서드(정적 메서드)
	public static int getCount() {
		return count;
		//return name; 		   -> 스태틱 메서드 메서드 에어리어에 우선적으로 적재되기 때문에 존재하지 않음 
	}						// -> 스태틱 메서드는 스태틱 메서드를 참조한다.
	
	
	public void speedUp(int speed) {
		this.speed = speed;
	}
	
	public void speedDown(int speed) {
		this.speed = speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도: " + this.speed);
	}
	
}
