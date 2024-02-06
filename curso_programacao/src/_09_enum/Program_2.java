package _09_enum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program_2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		Department workerDepartment = new Department(department);
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		
		System.out.print("Level: ");
		String level = sc.nextLine();
		
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(level), baseSalary, workerDepartment);
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		
		for(int i = 0; i<n; i++) {			
			System.out.println("Enter contract #" + (i+1) + " data:");
			
			System.out.print("Date (DD/MM/YYYY): ");
			sc.nextLine();
			Date contractDate = sdf.parse(sc.next());
			
			System.out.print("Value per hour: ");
			double valueHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int duration = sc.nextInt();
			
			HourContract cont = new HourContract(contractDate, valueHour, duration);
			worker.addContract(cont);
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthYear = sc.next();
		int  month = Integer.parseInt(monthYear.substring(0, 2));
		int year = Integer.parseInt(monthYear.substring(3));
		
		worker.income(month, year);
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthYear + ": " + String.format("%.2f", worker.income(month, year)));
		
		sc.close();
	}

}
