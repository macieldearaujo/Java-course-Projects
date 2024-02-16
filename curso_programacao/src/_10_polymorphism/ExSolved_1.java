package _10_polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee2;
import model.entities.OutsourcedEmployee;

public class ExSolved_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee2> employeeList = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			sc.nextLine();
			System.out.println("Employee #" + (1 + i) + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.nextLine().charAt(0);			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if(outsourced != 'y') {
				employeeList.add(new Employee2(name, hours, valuePerHour));
			} else {
				System.out.print("Additional charge: ");
				double aditionalCharge = sc.nextDouble();
				employeeList.add(new OutsourcedEmployee(name, hours, valuePerHour, aditionalCharge));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		
		for(Employee2 emp : employeeList) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}
}