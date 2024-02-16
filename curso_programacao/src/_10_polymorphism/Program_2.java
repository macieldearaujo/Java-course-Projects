package _10_polymorphism;

import model.entities.Account;
import model.entities.BussinessAccount;
import model.entities.SavingAccount;

public class Program_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account(1500, "Alex", 0.0);
		BussinessAccount bacc = new BussinessAccount(1501, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BussinessAccount(1502, "Maria", 0.0, 500.0);
		Account acc3 = new SavingAccount(1505, "Alexandre", 0.0, 0.01);
		
		BussinessAccount baa1 = new BussinessAccount();
		// DOWNCASTING
		BussinessAccount acc4 = (BussinessAccount)acc2; // In case you want use a function that is in a subclass in a superclass you have to downcasting
		acc4.loan(1500.0); // Just like this
		
		if(acc3 instanceof BussinessAccount) {
			BussinessAccount acc5 = (BussinessAccount)acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
