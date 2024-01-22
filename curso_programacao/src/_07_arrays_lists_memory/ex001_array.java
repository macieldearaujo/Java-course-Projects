package _07_arrays_lists_memory;

import java.util.Locale;
import java.util.Scanner;

public class ex001_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers are you going to type? ");
		int n = sc.nextInt();
		n = (n > 10) ? 10 : n;
		
		int[] vect = new int[n];
		
		for(int i = 0; i<vect.length; i++) {
			System.out.print("Type a number:  ");
			int number = sc.nextInt();
			vect[i] = number;
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		
		for(int i = 0; i<vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
