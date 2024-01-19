package _06_constructors_overload_this_encapsulation;

import java.util.Locale;
import java.util.Scanner;

import entities.Item;

public class ex001_constructors {

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

		Item product = new Item(name, price, quantity);
		
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
