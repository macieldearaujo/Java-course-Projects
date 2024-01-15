package _01_sequentialStructure;

import java.util.Scanner;

public class ex007 {

	// You'll can check the resolution on : https://github.com/acenelio/nivelamento-java/blob/master/src/uri1003.java
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n1, n2, soma;
		
		System.out.println("Digite um número:");
		n1 = sc.nextInt();
		
		System.out.println("Digite outro número:");
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		
		System.out.println("RESULTADO: " + soma);
		
		sc.close();
	}

}
