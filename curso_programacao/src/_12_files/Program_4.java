package _12_files;

import java.io.File;
import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a path: ");
		String scrPath = sc.next();
		
		File path = new File(scrPath);
		
		File[] folders = path.listFiles(File::isDirectory); // **********************
		
		System.out.println("FOLDERS:");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("FILES:");
		for(File file : files) {
			System.out.println(file);
		}
		
		//Creating a new folder
		boolean sucess = new File(path + "\\pasta_teste").mkdir(); // ****************************
		
		System.out.println("Directory created sucessfully: " + sucess);
		
		sc.close();
	}
	}