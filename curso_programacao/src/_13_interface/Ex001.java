package _13_interface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installament;
import model.services.ContractService;
import model.services.PaypalService;

public class Ex001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double contractValue = sc.nextDouble();
		
		Contract obj = new Contract(number, date, contractValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int numberInstallment = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
	
		contractService.processPayment(obj, numberInstallment);
		
		 List<Installament> list = obj.getInstalments();
		 
		 for(Installament installament : list) {
			 System.out.println(installament);
		 }
		
		sc.close();
	}

}
