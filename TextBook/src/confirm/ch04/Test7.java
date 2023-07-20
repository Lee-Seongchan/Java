package confirm.ch04;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			int balance = 0;
			
			System.out.println("-----------------");
			System.out.println("1.예금 | 2.출금 3.잔고 | 4.종료");
			System.out.println("-----------------");
			System.out.println("선택 > ");
			
			int answer = sc.nextInt();
			
			while(true) {
				
				if(answer == 4) {
					break;
				}
			}
			
		
		System.out.println("프로그램 종료");
	}
}
