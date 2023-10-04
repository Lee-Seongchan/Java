package step3;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
	//첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1; i < 10; i++ ) {
			System.out.println(num +  " * " +  i + " = " + num * i);
		}
		
		sc.close();
	}
}
