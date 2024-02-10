package _10_polymorphism;

import entities.Account;
import entities.SavingAccount;

public class Program_4 {

	public static void main(String[] args) {

		// Testing POLYMORPHISM ********************************
		Account acc1 = new Account(1001, "Alex", 1000.0);
		Account acc2 = new SavingAccount(1002, "Maria", 1000.0, 0.1);
		
		acc1.withdraw(50.0);
		acc2.withdraw(50.0);
		
		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());
		
	}

}