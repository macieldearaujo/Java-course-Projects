package _10_polymorphism;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Produto;
import entities.UsedProduct;

public class Ex001 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Product #" + (i+1) + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			
			if(ch == 'c') {
				products.add(new Produto(name, price));
			} else if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date = sc.next();
				UsedProduct usedProd = new UsedProduct(name, price, sdf.parse(date));
				products.add(usedProd);
			} else if(ch == 'i') {
				System.out.print("Costums fee: : ");
				double customsFee = sc.nextDouble();
				Produto imported = new ImportedProduct(name, price, customsFee);
				products.add(imported);
			}	
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Produto prod : products) {
			System.out.println(prod.priceTag());
		}
		
		
		sc.close();
	}
}
