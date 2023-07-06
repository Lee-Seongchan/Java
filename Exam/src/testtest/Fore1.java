package testtest;

import java.util.Scanner;

public class Fore1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오.");
		int n = sc.nextInt(); 
		
		for(int i = 1; i <= n; i++){
			for(int j = n; j > 0; j--){
				if(i < j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}sc.close();
	}

}


