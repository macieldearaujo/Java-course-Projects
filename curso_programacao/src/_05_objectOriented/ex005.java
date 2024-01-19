package _05_objectOriented;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ex005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student stud = new Student();
		
		String name = sc.nextLine();
		double grade1 = sc.nextDouble();
		double grade2 = sc.nextDouble();
		double grade3 = sc.nextDouble();
		
		stud.grade1 = grade1;
		stud.grade2 = grade2;
		stud.grade3 = grade3;
		
		double finalGrade = stud.finalGrade();
		
		System.out.println();
		System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
		
		if(finalGrade >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
			System.out.printf("MISSING %.2f POINTS", stud.missingPoints());
		}
		
		sc.close();
	}

}
