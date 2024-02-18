package _12_files;

import java.io.File;
import java.util.Scanner;

public class Program_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String strPath = sc.next();
		
		File file = new File(strPath);
		
		System.out.println("File's name: " + file.getName());
		System.out.println("File's parent: " + file.getParent());
		System.out.println("File's path: " + file.getPath());
		
		sc.close();
	}

}
