package model.services;

public interface InterestService {

	double getInterest();
	
	default double payment(double amount, int months) {
		return amount * Math.pow(1 + getInterest() / 100.00, months);
	}	
}
