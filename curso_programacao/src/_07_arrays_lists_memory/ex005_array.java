package _07_arrays_lists_memory;

import java.util.Locale;
import java.util.Scanner;

public class ex005_array {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers are you going to type? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i<vect.length; i++) {
			System.out.print("Type a number: ");
			int number = sc.nextInt();
			vect[i] = number;
		}
		
		double biggerValue = vect[0];
		int position = 0;
		
		System.out.println();
		for(int i = 0; i<vect.length; i++) {
			if(vect[i] > biggerValue) {
				biggerValue = vect[i];
				position = i;
			}
		}
		System.out.printf("BIGGER VALUE: %.2f%n", biggerValue);
		System.out.printf("POSITION OF THE BIGGER VALUE: %d%n", position);
				
		sc.close();
	}
}
