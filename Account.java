package exercise05;

public class Account {
	private  int balance;

	public Account(int a) {
		// TODO Auto-generated constructor stub
		balance=a;
	}
	public void checkBalance() {
		System.out.println(balance);
	}
	public void withdraw(int add) {
		balance+=add;
	}
	public void deposit(int sub) {
		balance-=sub;
	}
	public int getbalance() {
		return balance;
	}
}
