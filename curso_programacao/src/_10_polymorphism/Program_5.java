package _10_polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Account;
import model.entities.BussinessAccount;
import model.entities.SavingAccount;

public class Program_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Account acc = new Abst_Account();
		
//		Se a classe Account não pode ser instanciada, por
//		que simplesmente não criar somente SavingsAccount
//		e BusinessAccount?
		
//		• Resposta: • Reuso
		
//		• Polimorfismo: a superclasse classe genérica nos permite tratar
//		de forma fácil e uniforme todos os tipos de conta, inclusive
//		com polimorfismo se for o caso (como fizemos nos últimos
//		exercícios). Por exemplo, você pode colocar todos tipos de
//		contas em uma mesma coleção.
		
//		Account acc1 = new BussinessAccount();
//		Account acc2 = new SavingAccount();
		
//		System.out.println(acc);
//		System.out.println(acc1);
//		System.out.println(acc2);
		
		Locale.setDefault(Locale.US);
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BussinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingAccount(1003, "Bob", 300.00, 0.01));
		list.add(new BussinessAccount(1004, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: " + sum);
		
		for(Account acc : list) {
			acc.deposit(10);
			System.out.println("Update balance for account " + acc.getAccount() + ": " + String.format("%.2f", acc.getBalance()));
		}
	}

}
