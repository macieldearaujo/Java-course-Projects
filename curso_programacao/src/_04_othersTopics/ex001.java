package _04_othersTopics;

import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int mask = 0b100000;
		
		if((c & mask) != 0) {
			System.out.println("The 6th bit is true!");
		} else {
			System.out.println("The 6th bit is false!");
		}
		
		sc.close();		
	}

}
