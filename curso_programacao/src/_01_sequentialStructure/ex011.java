package _01_sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class ex011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, numPeca1, codigoPeca2, numPeca2;
		double precoPeca1, precoPeca2, total;
		
		codigoPeca1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		precoPeca1 = sc.nextDouble();
		
		codigoPeca2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		precoPeca2 = sc.nextDouble();
		
		total = numPeca1 * precoPeca1 + numPeca2 * precoPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
