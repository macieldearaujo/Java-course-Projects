package _06_constructors_overload_this_encapsulation;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class ex002_overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data:");

		System.out.print("Name:  ");
		String name = sc.nextLine();

		System.out.print("Price:  ");
		double price = sc.nextDouble();

		System.out.print("Quantity in stock:  ");
		int quantity = sc.nextInt();
		
		Product2 product = new Product2(name, price, quantity);
		
		product.setName("computer");
		System.out.println("Updated name:  " + product.getName());
		product.setPrice(1200);
		System.out.println("Updated price:  " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock:  ");
		quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.print("Updated data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock:  ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.print("Updated data: " + product);

		sc.close();
	}

}
