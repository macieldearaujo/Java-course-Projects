package _03_repetitionStructure;

import java.util.Scanner;

public class ex005 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Seja bem-vindo, digite um codigo: %n1.Álcool %n2.Gasolina %n3.Diesel %n4.Fim");
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int cod = sc.nextInt();
		
		while(cod != 4) {
			switch(cod) {
			case 1:
				alcool ++;
				break;
			case 2:
				gasolina ++;
				break;
			case 3:
				diesel ++;
				break;
			default:
				System.out.println("Número inválido");
				break;
			}
			
			cod = sc.nextInt();
		}
		
		System.out.printf("MUITO OBRIGADO %nAlcool: %d %nGasolina: %d %nDiesel: %d", alcool, gasolina, diesel);
		
		sc.close();
	}

}
