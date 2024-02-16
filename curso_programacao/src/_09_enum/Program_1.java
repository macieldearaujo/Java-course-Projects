package _09_enum;

import java.util.Date;
import java.util.Scanner;

import model.entities.OrderProduct;
import model.enums.OrderStatus;

public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OrderProduct product = new OrderProduct(1080, new Date(), OrderStatus.PROCESSING);
		System.out.println(product);
		
		OrderStatus os1 = OrderStatus.PENDING_PAYMENT;
		 OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		 
		 System.out.println(os1);
		 System.out.println(os2);
	}

}
