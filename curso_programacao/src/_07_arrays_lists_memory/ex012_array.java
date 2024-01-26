package _07_arrays_lists_memory;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.Position;

import entities.Registration;

public class ex012_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		List<Registration> employee = new ArrayList<>();

		n = (n > 10) ? 10 : n;
		n = (n <= 0) ? 1 : n;

		for (int i = 0; i < n; i++) {
			System.out.printf("%nEmployee #%d:%n", (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			employee.add(new Registration(id, name, salary));
		}

		System.out.printf("%nEnter the employee id that will have salary increase : ");
		int idChoosed = sc.nextInt();
		Integer index = position(employee, idChoosed);

		if (index == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			employee.get(index).increaseSalary(percent);
		}

		System.out.printf("%nList of employees:%n");

		for (Registration emp : employee) {
			System.out.println(emp);
		}

		sc.close();
	}

	public static Integer position(List<Registration> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
