package _07_arrays_lists_memory;

import java.util.Locale;
import java.util.Scanner;

public class ex004_array {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers are you going to type? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i = 0; i<vect.length; i++) {
			System.out.print("Type a number: ");
			int number = sc.nextInt();
			vect[i] = number;
		}
		
		int quantity = 0;
		
		System.out.println();
		System.out.print("EVEN NUMBERS: ");
		for(int i = 0; i<vect.length; i++) {
			if(vect[i]%2 == 0) {
				System.out.print(vect[i] + "  ");
				quantity += 1;
			}
		}
		
		System.out.printf("%n%nPARSE QUANTITY: %d%n", quantity);
		
		sc.close();
	}

}
