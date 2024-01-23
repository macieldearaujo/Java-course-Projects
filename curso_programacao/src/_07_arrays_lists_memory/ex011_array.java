package _07_arrays_lists_memory;

import java.util.Locale;
import java.util.Scanner;

public class ex011_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people will be typed? ");
		int n = sc.nextInt();

		double[] height = new double[n];
		char[] gender  = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Height of " + (i+1) + "st person: ");
			height[i] = sc.nextDouble();
			sc.nextLine();
			System.out.print("Gender of " + (i+1) + "st person: ");
			gender[i] = sc.nextLine().charAt(0);			
		}
		
		double lowestHeight = height[0], highestHeight = height[0];
		
		for (int i = 0; i < n; i++) {
			if(height[i] < lowestHeight) {
				lowestHeight = height[i];
			} else if(height[i] > highestHeight) {
				highestHeight = height[i];
			}
		}
		
		double avg = 0.0;
		int quantityWoman = 0, quantityMen = 0;
		
		for (int i = 0; i < n; i++) {
			if(gender[i] == 'F') {
				quantityWoman++;
				avg += height[i];
			} else {
				quantityMen++;
			}
		}
		
		avg /= (double) quantityWoman;
		
		System.out.println("Lowest height = " + lowestHeight);
		System.out.println("Highest height = " + highestHeight);
		System.out.printf("Avarege height of womans: %.2f%n", avg);
		System.out.printf("Numbers of men: %d%n", quantityMen);

		sc.close();
	}

}
