package entities;


public class BussinessAccount extends Account {
	
	private Double loanLimit;
	
	public BussinessAccount() {
	}

	public BussinessAccount(int account, String holder, double balance, Double loanLimit) {
		super(account, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10; // Changed to protected
		}
	}
}
