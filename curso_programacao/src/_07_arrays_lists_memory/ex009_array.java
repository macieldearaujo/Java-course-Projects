package _07_arrays_lists_memory;

import java.util.Locale;
import java.util.Scanner;

import entities.Personal_info;

public class ex009_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people will be written? ");
		int n = sc.nextInt();
		String[] names = new String[n];
		int[] ages = new int[n];
		
		String biggerAgeName = null;
		int biggerAge = 0;

		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + "st person's data: ");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			names[i] = name;
			
			System.out.print("Age: ");
			int age = sc.nextInt();
			ages[i] = age;

			if(ages[i] > biggerAge) {
				biggerAge = ages[i];
				biggerAgeName = names[i];
			}
		}
		
		System.out.printf("OLDER PERSON: %s%n", biggerAgeName);
	}

}
