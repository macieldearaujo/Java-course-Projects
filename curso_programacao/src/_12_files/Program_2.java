package _12_files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entities.Product;

public class Program_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String path = "C:\\temp\\testing_files\\in.csv";
		List<Product> products = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line != null) {
				String[] words = line.split(",");
				for(String a : words) {
					Product prod = new Product(words[0], Double.parseDouble(words[1]), Integer.parseInt(words[2]));
					products.add(prod);
				}
				
				line = br.readLine();
			}			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
