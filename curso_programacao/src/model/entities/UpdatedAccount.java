package model.entities;

import model.exceptions.DomainException;

public class UpdatedAccount {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public UpdatedAccount() {
	}
	
	public UpdatedAccount(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(balance <= 0 && amount > 0) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		if(amount > balance) {
			throw new DomainException("Withdraw error: Not enough balance");
		}		
		if(amount > withdrawLimit) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		
		balance -= amount;
	}
	
}
