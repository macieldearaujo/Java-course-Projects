package _05_objectOriented;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Rectangle;

public class ex003 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height");
		
		double width = sc.nextDouble();
		rectangle.width = width;
		
		double heigth = sc.nextDouble();
		rectangle.heigth = heigth;
		
		
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		
		sc.close();
	}
	
}
