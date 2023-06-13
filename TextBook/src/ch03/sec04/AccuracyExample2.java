package ch03.sec04;

public class AccuracyExample2 {

	public static void main(String[] args) {
		int apple = 1;
		int totalPieces = apple * 10;
		int number = 7;
		
		int result = totalPieces - number;
		System.out.println("10조각에서 남은 조각 " + result);
		System.out.println("1조각에서 남은 조각 " + result/10.0);  
		// 그냥 10을 나누면 0이 출력되기 때문에 10.0으로 하여 실수 값(나머지) 출력
	}

}
