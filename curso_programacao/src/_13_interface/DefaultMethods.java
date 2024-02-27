package _13_interface;

import java.util.Locale;
import java.util.Scanner;

import model.services.InterestService;
import model.services.UsaInterestService;

public class DefaultMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantia: ");
		double value = sc.nextDouble();
		System.out.print("Meses: ");
		int months = sc.nextInt();
		
		InterestService is = new UsaInterestService(1.0);
		double payment = is.payment(value, months);
		
		System.out.println("Payment after " + months + " months.");		
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
	}
}