package _03_repetitionStructure;

import java.util.Locale;
import java.util.Scanner;

public class ex010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de repetições:");
		int quant = sc.nextInt();
		
		System.out.println("Digite os valores:");
		for(int i = 0; i<quant; i++) {
			int numerador = sc.nextInt();
			int denominador = sc.nextInt();
			
			if(denominador != 0) {
				double result = (double) numerador / denominador;
				System.out.println(result);
			} else {
				System.out.println("divisao impossivel");
			}
		}
		
		sc.close();
	}

}
