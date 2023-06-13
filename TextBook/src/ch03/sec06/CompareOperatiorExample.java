package ch03.sec06;

public class CompareOperatiorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		char char1 = 'A'; //65
		char char2 = 'B'; //66
		boolean result4 = (char1 < char2); 
		System.out.println("result4 : " + result4);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4);
		System.out.println("result5 : " + result5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6); // false 
		// 0.1f == 0.1이 false인 이유는 부동 소수점 방식을 사용하는 실수 타입은 0.1을 정확히 표현할 수 없을 뿐만 
		// 아니라 float타입과 double 타입의 정밀도 차이
		boolean result7 = (num5 == (float)num6); //true
		//0.1f == (float)0.1처럼 피연사자를 float타입으로 강제 형변환 후에 비교연산을 하게 되면 true가 됨
		System.out.println("result6 : " + result6);
		System.out.println("result7 : " + result7);
		
		String str1 = "자바";
		String str2 = "Java";
		boolean result8 = (str1.equals(str2));
		boolean result9 = (! str1.equals(str2));
		System.out.println("result8 : " + result8);
		System.out.println("result9 : " + result9);
		// 문자열을 비교할 때에는 (==, !=) 연산자 대신 equals()와 !equals()를 사용한다. 
		
	}

}
