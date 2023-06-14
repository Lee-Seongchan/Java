package test1;

import java.util.Scanner;

/**
 * 
 * 날짜 : 2023/06/13
 * 이름 : 이성찬
 * 내용 : JAVA 삼항연산자 연습문제 
 * 
 */
public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x = sc.nextInt();
		
		System.out.print("y값 입력 : ");
		int y = sc.nextInt();
		
		String result = x > y ? "x가 더 큽니다." : "y가 더 큽니다.";
		//삼항 연산자의 데이터 타입은 결과값에 맞춘다.
		System.out.println(result);
	}
}
