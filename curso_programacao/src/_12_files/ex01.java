package _12_files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entities.Product;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\temp\\testing_files\\in.csv"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\temp\\testing_files\\out\\summary.csv"))) {			

			String line = br.readLine();

			while (line != null) {
				String[] words = line.split(",");
				Product prod = new Product(words[0], Double.parseDouble(words[1]), Integer.parseInt(words[2]));
				products.add(prod);
				
				line = br.readLine();
			}
			
			for(Product p : products) {
				bw.append(p.getName() + "," + p.totalValueinStock());
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
