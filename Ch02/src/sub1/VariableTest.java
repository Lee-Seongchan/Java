package sub1;


/**
 * 
 * 날짜 : 2023/06/13
 * 이름 : 이성찬
 * 내용 : Ch02.Java 변수와 연산자 실습
 * 
 * 변수(variable)
 *  - 데이터 처리를 위한 데이터 그릇
 *  - 변수는 메모리 공간이며 각 데이터의 종류에 따라 크기가 다름
 *  
 *  상수(Constant)
 *  - 최초 저장된 데이터로 고정된 변수
 *  - 대문자로 표기
 *
 */


public class VariableTest {

	public static void main(String[] args) {
	
	// 변수
	int a = 3;
	int b = 7;
	
	System.out.println("a : " + a);
	System.out.println();
	
	a = 5;
	
	System.out.println("a : " + a);
	System.out.println("b : " + b);
	
	String name = "홍길동";
	System.out.println(name + "님 반갑습니다");
	
	
	// 상수 
	final int NUM = 5; //상수는 대문자로 표기 
	System.out.println("NUM = " + NUM);
	// NUM = 7; 상수는 변하지 않는 수 없는 수 이기 때문에 에러가 뜬다.
	
	
	
	}
}
