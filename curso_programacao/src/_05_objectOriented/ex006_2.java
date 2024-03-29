package _05_objectOriented;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ex006_2 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		double pi = Calculator.PI;
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f", pi);
		
		sc.close();
	}

}
