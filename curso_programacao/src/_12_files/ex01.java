package _12_files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Product;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.println("Enter a path: ");
		String sourceFileStr = sc.nextLine();

		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean sucess = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr));
			BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				products.add(new Product(name, price, quantity));
				
				line = br.readLine();
			}
			
			for(Product prod : products) {
				bw.write(prod.getName() + "," + String.format("%.2f", prod.totalValueinStock()));
				bw.newLine();
			}
			
		} catch(IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
		
		sc.close();
	}
}
