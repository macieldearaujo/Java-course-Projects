package _05_objectOriented;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ex007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais: " + CurrencyConverter.conversion(dollar, quantity));
		
		sc.close();
	}

}
