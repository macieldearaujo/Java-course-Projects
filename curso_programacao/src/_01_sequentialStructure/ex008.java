package _01_sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class ex008 {
	
	// You'll can check the resolution on : https://github.com/acenelio/nivelamento-java/blob/master/src/uri1002.java

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		System.out.println("Digite o valor do raio:");
		raio = sc.nextDouble();
		area = 3.14159 * Math.pow(raio, 2.0);
		
		System.out.printf("Resultado da área: %.4f%n", area);
		
		sc.close();
	}

}
