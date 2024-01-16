package _03_repetitionStructure;

import java.util.Scanner;

public class ex007 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		for(int i = 0; i < valor; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
	}

}
