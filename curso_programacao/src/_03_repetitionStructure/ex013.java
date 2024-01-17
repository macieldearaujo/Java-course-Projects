package _03_repetitionStructure;

import java.util.Locale;
import java.util.Scanner;

public class ex013 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			int i2 = i * i;
			int i3 = i * i * i;
			
			System.out.printf("%d %d %d%n", i, i2, i3);
		}
		
		sc.close();
	}

}
