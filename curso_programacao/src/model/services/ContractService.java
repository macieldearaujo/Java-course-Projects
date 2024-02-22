package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installament;

public class ContractService {

	private OnlinePaymentService paymentService;

	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void processPayment(Contract contract, Integer months) {		
		for(int i = 1; i<=months; i++) {
			double totalValue = contract.getTotalValue() / months;
			double interest = paymentService.interest(totalValue, i);
			double paymentFee = paymentService.paymentFee(totalValue + interest);
			totalValue += paymentFee + interest;			
			LocalDate dueDate = contract.getDate().plusMonths(i);			
			contract.getInstalments().add(new Installament(dueDate, totalValue));
		}
	}
}