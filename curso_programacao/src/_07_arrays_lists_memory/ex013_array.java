package _07_arrays_lists_memory;

import java.util.Locale;
import java.util.Scanner;

public class ex013_array {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int search = sc.nextInt();
		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				if(mat[i][j] == search) {
					
					System.out.printf("Position %d,%d:%n", i, j);
					
					if((j - 1) >= 0) {
						System.out.printf("Left: %d%n", mat[i][j-1]);
					}
					if((i - 1) >= 0) {
						System.out.printf("Up: %d%n", mat[i-1][j]);	
					}
					if((j + 1) < n) {
						System.out.printf("Right: %d%n", mat[i][j+1]);	
					}
					if((i + 1) < m) {
						System.out.printf("Down: %d%n", mat[i+1][j]);	
					}
				}
			}
		}
		
		sc.close();
	}
}
