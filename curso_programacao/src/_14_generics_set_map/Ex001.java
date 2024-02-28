package _14_generics_set_map;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			int studentCode = sc.nextInt();
			a.add(studentCode);
		}
		
		System.out.print("How many students for course B? ");
		
		n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			int studentCode = sc.nextInt();
			b.add(studentCode);
		}
		
		System.out.print("How many students for course C? ");
		
		n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			int studentCode = sc.nextInt();
			c.add(studentCode);
		}
		
		Set<Integer> result = new HashSet<>(a);
		result.addAll(b);
		result.addAll(c);
		
		System.out.println("Total students: " + result.size());
		
		sc.close();
	}
}