package test3;

/*
 * 날짜 : 2023/06/23
 * 이름 : 이성찬
 * 내용 : 클래스 상속 연습문제
 * 
 */
class Rent{
	public void payment() {
		System.out.println("임대료를 받습니다.");
	}
}

class Loadload extends Rent{
	
	public void getMoney() {
		System.out.println("건물주 입니다.");
		payment();
	}
}

public class Test06 {

	public static void main(String[] args) {
		
		Loadload master = new Loadload();
		master.getMoney();
	}

}
