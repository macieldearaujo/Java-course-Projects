package entities;

public class Account {
	
	private int account;
	private String holder;
	private double balance;
	
	public Account(int account, String holder, double initialDeposit) {
		this.account = account;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Account(int account, String holder) {
		this.account = account;
		this.holder = holder;
	}

	public int getAccount() {
		return account;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		this.balance -= (value + 5);
	}
	
	public String toString() {
		return "Account: " + account + ", Holder: " + holder + ", Balance:  $ " + String.format("%.2f", balance);
	}
	
}
