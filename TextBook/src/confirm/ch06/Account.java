package confirm.ch06;

public class Account {

	int balance;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int money) {
		if(money < MIN_BALANCE) {
			System.out.println(balance);
		}else if(money > MAX_BALANCE) {
			System.out.println(balance);
		}else {
			System.out.println(this.balance = money);
		}
		
		
		
	}
}
