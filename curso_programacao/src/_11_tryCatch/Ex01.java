package _11_tryCatch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.UpdatedAccount;
import model.exceptions.DomainException;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Initial limit: ");
			double withdrawLimit = sc.nextDouble();
			
			UpdatedAccount acc = new UpdatedAccount(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double withdrawAmount = sc.nextDouble();
			acc.withdraw(withdrawAmount);
			
			System.out.print("New balance: " + String.format("%.2f", acc.getBalance()));
		} catch(InputMismatchException e) {
			System.out.println("Error: only numbers are valid");
		} catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
