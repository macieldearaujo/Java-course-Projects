package _01_sequentialStructure;

import java.util.Locale;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 1.5258558874;

		System.out.printf("%.2f%n", x); // "%.2f%n"
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.printf("RESULTADO: %.2f metros %n", x);
		
		//
		
		String nome = "Douglas";
		int idade = 20;
		double salario = 1500.4;
		
		System.out.printf("%s tem %d anos e ganha R$ %.1f reais %n", nome, idade, salario);
	}

}
 