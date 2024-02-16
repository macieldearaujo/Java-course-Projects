package _09_enum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Client;
import model.entities.OrderE;
import model.entities.OrderItem;
import model.entities.ProductE;
import model.enums.OrderStatus;

public class ex001 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		
		OrderE order = new OrderE(new Date(), OrderStatus.valueOf(status), new Client(name, email, birthDate));
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Enter #" + (i+1) + " item data:");
			
			sc.nextLine();
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quant = sc.nextInt();
			
			ProductE prod = new ProductE(productName, price);
			OrderItem item = new OrderItem(quant, price, prod);
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}
}
