package _01_sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class ex006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		double largura, comprimento, area, valorM2, precoTotal;
		
		System.out.println("Digite a largura:");
		largura = sc.nextDouble();
		
		System.out.println("Digite o comprimento:");
		comprimento = sc.nextDouble();
		
		System.out.println("Digite o preço do metro quadrado:");
		valorM2 = sc.nextDouble();
		
		area = largura * comprimento;
		precoTotal = valorM2 * area;
		
		System.out.printf("Saída: AREA = %.2f%nPREÇO = %.2f%n", area, precoTotal);
		
		sc.close();
	}

}
