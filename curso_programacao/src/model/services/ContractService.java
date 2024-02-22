package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installament;

public class ContractService {

	private OnlinePaymentService paymentService;

	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public OnlinePaymentService getPaymentService() {
		return paymentService;
	}

	public void setPaymentService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void processPayment(Contract contract, Integer months) {		
		for(int i = 1; i<=months; i++) {
			double totalValue = contract.getTotalValue() / months;
			
			double interest = paymentService.interest(totalValue, i);
			totalValue += interest;
			double paymentFee = paymentService.paymentFee(totalValue);
			totalValue += paymentFee;
			
			LocalDate dueDate = contract.getDate().plusMonths(i);			
			contract.addList(new Installament(dueDate, totalValue));
		}
	}
}
