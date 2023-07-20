package confirm.ch06;

import java.util.Scanner;

class BankAccount{
	
	private String id;
	private String name;
	private int balance;
	
	public BankAccount(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	
	
	
}


public class BankApplication {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BankAccount[] accounts = new BankAccount[100];
		
		while(true) {
			System.out.println("------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------");
		
			System.out.print("선택 : ");
			int answer = sc.nextInt();
			
			if(answer == 5) {
				break;
			}else if(answer == 1) {
				System.out.println("--------");
				System.out.print("계좌생성");
				System.out.println("--------");
				
				System.out.print("계좌번호 : ");
				String id = sc.next();
				
				System.out.print("계좌주");
				String name = sc.next();
				
				System.out.print("초기입금금액");
				int balance = sc.nextInt();
				
				BankAccount account = new BankAccount(id, name, balance);
				
				for(int i = 0; i <accounts.length; i++) {
					
					if(accounts[i] == null) {
						accounts[i] = account;
						System.out.println("결과 : 계좌가 생성되었습니다.");
						break;
					}
				}
				
				
				
				}else if(answer == 2) {
					System.out.println("--------");
					System.out.print("계좌목록");
					System.out.println("--------");
				}
				
				for(BankAccount account : accounts) {
					if(account != null) {
						System.out.println(account);
						}
					}
			
			
			
			
		}
		System.out.println("프로그램 종료");
	}
}
