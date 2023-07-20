package confirm.ch07;

public class Child01 extends Parent01{
	
	public int studentNo;
	
	public Child01(String name, int studentNo) {
		super(name); //부모 클래스를 호출하여 초기화 해줘야한다.
		this.studentNo = studentNo;
	}
}
