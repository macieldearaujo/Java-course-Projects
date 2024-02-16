package _07_arrays_lists_memory;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Personal_info;

public class ex003_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people will be written? ");
		int n = sc.nextInt();
		Personal_info[] person = new Personal_info[n];
		double sum = 0, perc = 0;

		for (int i = 0; i < person.length; i++) { // input to get data
			System.out.println((i + 1) + "st person's data: ");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			System.out.print("Height: ");
			double height = sc.nextDouble();

			person[i] = new Personal_info(name, age, height);

			sum += person[i].getHeight();
			
			if (person[i].getAge() < 16) { // average height
				perc += 1;
			}
		}

		double result = (perc / n)* 100;
		
		System.out.printf("Average height: %.2f%n", (sum / person.length));
		System.out.printf("People under 16 years: %.1f%n", result + "%");

		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}
		}

		sc.close();
	}

}
