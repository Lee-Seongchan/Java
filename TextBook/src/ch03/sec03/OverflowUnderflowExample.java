package ch03.sec03;

// overflow란 타입이 허용하는 최대값을 벗어나는 것 
// underflow는 타입이 허용하는 최소값을 벗어나는것 
// 오버플로우 또는 언더플로우가 발생되면 실행 에러가 발생할 것 같지만 그렇지는 않고 해당 정수 타입의 최소값 또는 최대값으로 돌아간다.

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		byte var1 = 125;
		for(int i = 0; i < 5; i++) { //5번 반복 실행
			var1++;					 // var1값을 1증가한다.	
			System.out.println("var1 : " + var1); 
			//byte의 최대값인 127을 초과하면 오버플러우가 발생하여 최소값이 -128로 돌아간 뒤
			//나머지 반복문 실행
		}
		
		System.out.println("---------------------------------");
		
		byte var2 = -125;
		for(int i = 0; i < 5; i++) {
			var2--;
			System.out.println("var2 : " + var2);
			// byte의 최대값인 -128을 초과하면 오버플러우가 발생하여 최대값인 127로 돌아간 뒤
			//나머지 반복문 실행
		}
	}

}
