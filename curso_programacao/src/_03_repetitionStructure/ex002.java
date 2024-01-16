package _03_repetitionStructure;

import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int total = 0;
		
		while(x != 0) {
			total += x;
			x = sc.nextInt();
		}
		
		System.out.println("TOTAL: " + total);
		
		sc.close();
	}

}
