package _02_conditionalStructure;

import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		String dia;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		
		switch(x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda-feira";
			break;
		case 3:
			dia = "terça-feira";
			break;
		case 4:
			dia = "quarta-feira";
			break;
		case 5:
			dia = "quinta-feira";
			break;
		case 6:
			dia = "sexta-feira";
			break;
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "Inválido";
		}
		
		System.out.println("Dia da semana: " + dia);
	}

}
