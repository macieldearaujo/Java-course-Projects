package entities;


public class BussinessAccount extends Account {
	
	private Double loanLimit;
	
	public BussinessAccount() {
	}

	public BussinessAccount(int account, String holder, double balance, Double loanLimit) {
		super(account, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	
}
