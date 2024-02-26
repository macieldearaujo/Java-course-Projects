package _14_generics_set_map;

import java.util.Scanner;

import model.services.PrintService;

public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		PrintService<Integer> ps = new PrintService<>();
		
		for(int i = 0;i<n;i++) {
			int value = sc.nextInt();
			
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();
	}
}