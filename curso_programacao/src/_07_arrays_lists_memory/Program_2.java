package _07_arrays_lists_memory;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Product_2;

public class Program_2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product_2[] products = new Product_2[n];
		double sum = 0;
		
		for(int i = 0; i<products.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			products[i] = new Product_2(name, price);
			
			sum += products[i].getPrice();
		}
		
		double avr = sum / products.length;
		
		System.out.printf("AVARAGE PRICE: %.2f", avr);
		
		sc.close();
	}
}
