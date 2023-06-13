package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		
		/*
		 * 나눗셈 또는 나머지(%) 연산에서 좌측 피연산자가 정수이고 우측 피연산자가 0일 경우 
		 * 예외(AritmeticException)이 발생 -> 무한대의 값을 정수로 표현할 수 없기 때문 
		 * 좌측 피연산자가 실수이거나 추츨 피연산자가 0.0또는 0.0f이면 예외가 발생하지 않고
		 * 연산의 결과는 Infinity(무한대) 또는 NnN(Not a Number)이 된다.
		 */
		
		int x = 5;
		double y = 0.0;
		//double z = x / y; // Infinity
		double z = x % y;	// NaN 
		
		System.out.println(z + 2);
		
		if(Double.isFinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z + 2);
		}
	}

}
