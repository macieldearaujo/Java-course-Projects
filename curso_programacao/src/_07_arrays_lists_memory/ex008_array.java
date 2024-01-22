package _07_arrays_lists_memory;

import java.util.Locale;
import java.util.Scanner;

public class ex008_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many elements will vector have? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double avg = 0;
		double even = 0;

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Type a number: ");
			int number = sc.nextInt();

			if (number % 2 == 0) {
				avg += number;
				even++;
			}
		}

		if (even == 0) {
			System.out.println("NONE EVEN NUMBERS");
		} else {
			avg = avg/ even;
			System.out.printf("EVEN AVERAGE: %.1f%n", avg);
		}
		
		sc.close();
	}

}
