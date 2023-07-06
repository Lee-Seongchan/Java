package testtest;

import java.util.Scanner;

public class Fore2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오.");
		
		int n = sc.nextInt(); 
		
		for(int i = 0; i < n; i++) {
			
			for(int j = n-1; j > i ; j--){
				System.out.print("☆");
			}for(int j= 0; j < i * 2 + 1 ; j++) {
				System.out.print("★");
				}for(int j = n; j-1 > i; j--) {
					System.out.print("☆");
				}
			System.out.print("\n");
			
		}sc.close();
	}
}

