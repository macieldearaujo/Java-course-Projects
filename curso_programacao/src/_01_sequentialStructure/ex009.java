package _01_sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class ex009 {

	// You'll can check the resolution on : https://github.com/acenelio/nivelamento-java/blob/master/src/uri1007.java
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.println("Diferença = " + diferenca);
		
		sc.close();
	}

}
