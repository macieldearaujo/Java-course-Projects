package _07_arrays_lists_memory;

import java.util.Locale;
import java.util.Scanner;

public class ex007_array {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many elements will vector have? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i<vect.length; i++) {
			System.out.print("Type a number: ");
			vect[i] = sc.nextDouble();
		}
		
		double avg = 0;
		
		for(int i = 0; i<vect.length; i++) {
			avg += vect[i];
		}
		
		avg /= n;
		System.out.printf("%nVECTOR AVERAGE: %.3f%n", avg);
		
		System.out.println("ELEMENTS BELOW AVERAGE: ");
		for(int i = 0; i<n; i++) {
			if(vect[i] < avg) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}
		
		sc.close();
	}
}