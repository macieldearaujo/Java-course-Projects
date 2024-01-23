package _07_arrays_lists_memory;

import java.util.Locale;
import java.util.Scanner;

public class ex010_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many students will be typed? ");
		int n = sc.nextInt();

		double[] grade1 = new double[n];
		double[] grade2 = new double[n];
		String[] studentName = new String[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Type name, first and second grade of " + (i+1) + "st student:");
			studentName[i] = sc.nextLine();
			grade1[i] = sc.nextDouble();
			grade2[i] = sc.nextDouble();
		}
		
		System.out.println("APPROVED STUDENTS:");
		for(int i = 0; i < n; i++) {
			double avg = (grade1[i] + grade2[i]) / 2;
			if(avg >= 6.0) {
				System.out.println(studentName[i]);
			}
		}

		sc.close();
	}

}
