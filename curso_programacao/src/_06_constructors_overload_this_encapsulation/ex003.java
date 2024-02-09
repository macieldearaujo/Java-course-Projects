package _06_constructors_overload_this_encapsulation;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account ac;
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there a initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDepositValue = sc.nextDouble();
			ac = new Account(account, holder, initialDepositValue);
		} else {
			ac = new Account(account, holder, 6800);
		}
		
		System.out.printf("%nAccount data: %n%s%n", ac);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		ac.deposit(deposit);
		System.out.printf("Account data: %n%s%n", ac);
		
		System.out.printf("%nEnter a withdraw value: ");
		double withdraw = sc.nextDouble();
		ac.withdraw(withdraw);
		System.out.printf("Account data: %n%s%n", ac);
		sc.close();
	}

}
