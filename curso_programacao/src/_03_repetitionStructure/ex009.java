package _03_repetitionStructure;

import java.util.Locale;
import java.util.Scanner;

public class ex009 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor de repetições:");
		int quant = sc.nextInt();
		
		double v1 = 0;
		double v2 = 0;
		double v3 = 0;
		
		System.out.println("Digite " + quant + " valores abaixo:");
		
		for(int i = 0; i < quant; i++) {
			v1 = sc.nextDouble();
			v2 = sc.nextDouble();
			v3 = sc.nextDouble();
			
			double media = (v1*2.0 + v2*3.0 + v3*5.0) / 10;
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}

}
