package entities;

public class SavingAccount extends Account {

	private Double interestRate;

	public SavingAccount() {
		super();
	}
	
	public SavingAccount(int account, String holder, double balance, Double interestRate) {
		super(account, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
}
