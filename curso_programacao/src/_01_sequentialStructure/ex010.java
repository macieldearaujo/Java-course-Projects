package _01_sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class ex010 {

	// You'll can check the resolution on : https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFunc, horasTrabFunc;
		double valorHoraFunc, salario;
		
		numeroFunc = sc.nextInt();
		horasTrabFunc = sc.nextInt();
		valorHoraFunc = sc.nextDouble();
		
		salario = horasTrabFunc * valorHoraFunc;
		
		
		System.out.printf("NUMBER: %d%nSALARY = $ %.2f", numeroFunc, salario);
		
		sc.close();
	}

}
