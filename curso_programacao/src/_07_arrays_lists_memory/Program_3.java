package _07_arrays_lists_memory;

import java.util.Locale;
import java.util.Scanner;

import entities.StudentHotel;

public class Program_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		StudentHotel[] student = new StudentHotel[10];
		
		n = (n > 10) ? 10 : n;
		n = (n <= 0) ? 1 : n;
		
		for(int i = 0; i<n; i++) {
			System.out.printf("%nRent #%d%n", (i + 1));
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomPicked = sc.nextInt();
			
			student[roomPicked] = new StudentHotel(name, email, roomPicked);
		}  
		
		System.out.println("Busy rooms:");
		for(int i = 0; i<10; i++) {
			if(student[i] != null) {
				System.out.println(i + ": " + student[i]);
			}
		}
		
		
		sc.close();
	}

}
