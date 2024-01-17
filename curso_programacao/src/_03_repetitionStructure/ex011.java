package _03_repetitionStructure;

import java.util.Locale;
import java.util.Scanner;

public class ex011 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int resultado = 1;
		
			for(int i = 1; i<=n; i++) {			
				resultado = resultado * i;
			}
		
		System.out.println(resultado);
		
		sc.close();
	}

}
