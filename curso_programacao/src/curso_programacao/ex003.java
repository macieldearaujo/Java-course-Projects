package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// Int
		char inteiro;
		
		System.out.println("Digite um número inteiro:");
		inteiro = sc.next().charAt(0);
		System.out.printf("Você digitou %s%n", inteiro);
		
		// Char
		char caractere;
		
		System.out.println("Digite um caractere:");
		caractere = sc.next().charAt(0);
		System.out.printf("Você digitou %s%n", caractere);
		
		// Float number
		Locale.setDefault(Locale.US);

		double x;		
		System.out.println("Digite um número flutuante:");
		x = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", x);
		
		
		// Vários dados
		
		String a;
		int b;
		double c;
		
		System.out.println("Digite uma palavra A:");
		a = sc.next();
		
		System.out.println("Digite o número inteiro B:");
		b = sc.nextInt();
		
		System.out.println("Digite o número flutuante C:");
		c = sc.nextDouble();
		
		System.out.println("Valores digitados:");
		System.out.println("A:" + a);
		System.out.println("B:" + b);
		System.out.println("C" + c);
		sc.close();
	}

} 
