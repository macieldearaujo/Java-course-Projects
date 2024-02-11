package _10_polymorphism;

import java.util.Scanner;

import entities.Employee2;
import entities.OutsourcedEmployee;

public class ExSolved_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
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
				Employee2 emp = new Employee2(name, hours, valuePerHour);
			} else {
				System.out.print("Additional charge: ");
				double aditionalCharge = sc.nextDouble();
				Employee2 emp = new OutsourcedEmployee(name, hours, valuePerHour, aditionalCharge);
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		System.out.println(Employee2.toString());
		
		
		sc.close();
	}

}
