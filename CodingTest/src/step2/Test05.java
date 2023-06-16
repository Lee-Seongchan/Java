package step2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m >= 45) {
			System.out.print(h + " ");
			System.out.println(m-45);
		}else if(h > 0){
			System.out.print(h-1 + " ");
			System.out.println(m-45 + 60);
		}else {
			System.out.print(h-1 + 24 + " ");
			System.out.println(m-45 + 60);
		}
	}
}
