package _07_arrays_lists_memory;

import java.util.Locale;
import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers are you going to type? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0, avg;
		
		for(int i = 0; i<vect.length; i++) {
			System.out.printf("Type a number: ");
			double number = sc.nextDouble();
			vect[i] = number;
			sum += vect[i];
		}
		
		System.out.print("VALUES: ");
		
		for(int i = 0; i<vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		
		avg = sum / n;
		
		System.out.printf("%nSUM: %.1f%n", sum);
		System.out.printf("AVARAGE: %.1f%n", avg);
		
		sc.close();
	}

}
