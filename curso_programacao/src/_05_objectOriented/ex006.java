package _05_objectOriented;

import java.util.Locale;
import java.util.Scanner;

public class ex006 {

	public static final double PI = 3.14; // final = ***CONSTANTE***
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f", PI);
		
		sc.close();
	}
	
	public static double circumference(double radius) { /* You only can call a static method in a static function. 
		You cannot call a non-static function within a static function. */
		
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
