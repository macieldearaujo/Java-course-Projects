package _05_objectOriented;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee;

public class ex004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		employee.name = name;
		
		System.out.print("Gross salary: ");
		double grossSalary = sc.nextDouble();
		employee.grossSalary = grossSalary;
		
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		employee.tax = tax;
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.print("Which percentage to increasy salary? ");
		double percentage = sc.nextDouble();
		employee.increasePercentage(percentage);
		
		System.out.println();
		System.out.println("Update data: " + employee);
		
		sc.close();
	}

}
