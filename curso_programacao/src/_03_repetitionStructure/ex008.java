package _03_repetitionStructure;

import java.util.Scanner;

public class ex008 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int quant = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for(int i = 0; i<quant; i++) {
			int num = sc.nextInt();
			if(10 <= num && num <= 20) {
				in++;
			} else {
				out++;
			};
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
