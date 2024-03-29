package _07_arrays_lists_memory;

import java.util.Locale;
import java.util.Scanner;

public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double result = sum / n;
		
		System.out.printf("AVARAGE HEIGHT: %.2f%n", result);
		
		sc.close();
	}

}
