package _07_arrays_lists_memory;

import java.util.Locale;
import java.util.Scanner;

public class ex006_array {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many values will each vector have? ");
		int n = sc.nextInt();
		int[] vectorA = new int[n];
		int[] vectorB = new int[n];
		int[] vectorC = new int[n];

		System.out.println("Type the values of vector A:");

		for (int i = 0; i < n; i++) {
			vectorA[i] = sc.nextInt();;
		}
		
		System.out.println("Type the values of vector B:");

		for (int i = 0; i < n; i++) {
			vectorB[i] = sc.nextInt();;
		}
		
		for (int i = 0; i < n; i++) {
			vectorC[i] = vectorA[i] + vectorB[i];
		}
		
		System.out.println("RESULTING VECTOR:");
		
		for (int i = 0; i < n; i++) {
			System.out.println(vectorC[i]);
		}

		sc.close();
	}
}