package _02_conditionalStructure;

import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String condicao = (5 > 10) ? "sim" : "não";
		
		System.out.println(condicao);
		
		// Demo
		
		double preco = 34.5;
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
			
		
		sc.close();
	}

}
