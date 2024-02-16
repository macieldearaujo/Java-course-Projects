package _10_polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.LegalPerson;
import model.entities.NaturalPerson;
import model.entities.TaxPayer;

public class Ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Tax payer #" + i +" data: ");
			System.out.print("Individual or company (i/c)? ");
			char typeOfPayer = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double annualSalary = sc.nextDouble();
			
			if(typeOfPayer == 'i') {
				System.out.print("Health expenditures: ");
				double healthCare = sc.nextDouble();
				TaxPayer naturalPerson = new NaturalPerson(name, annualSalary, healthCare);
				list.add(naturalPerson);
			} else if(typeOfPayer == 'c') {
				System.out.print("Number of employees: ");
				int employeesNumber = sc.nextInt();
				TaxPayer legalPerson = new LegalPerson(name, annualSalary, employeesNumber);
				list.add(legalPerson);
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0;
		
		for(TaxPayer payer : list) {
			System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.tax()));
			sum += payer.tax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		
		
		sc.close();
	}

}
