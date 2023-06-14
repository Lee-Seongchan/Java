package ch04.sec03;

public class SwitchExample {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6) + 1;
		// 각 변을 int 타입으로 강제 형변환하여 0,1,2,3,4,5 정수를 얻고 마지막 변에 
		// +1을 하면 1,2,3,4,5,6 중에서 하나의 정수 난수를 얻게 된다.
		
		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;	
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
		}
	}

}
