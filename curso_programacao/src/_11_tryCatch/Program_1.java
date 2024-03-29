package _11_tryCatch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		} catch(InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		System.out.println("End of program...");
		
		sc.close();
		
	}

}
