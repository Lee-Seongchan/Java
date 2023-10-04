package step2;

import java.util.Scanner;


public class Test07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int result = 0;
		
		if(num1 == num2 || num1 == num3) {
			result = 10000 + num1 * 1000;
		}else if(num1 == num2 && num1 == num3){
			result = 1000 * num1 * 100;
		}else if(num2 == num3) {
			result = 1000 * num2 * 100;
		}else {
			result = Math.max(num1,  Math.max(num2, num3)) * 100;
		}
		System.out.println(result);
		sc.close();
	}

}