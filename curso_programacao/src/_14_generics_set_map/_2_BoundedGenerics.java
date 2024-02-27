package _14_generics_set_map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.ProductGenerics;
import model.services.CalculationService;

public class _2_BoundedGenerics {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "C:\\temp\\testing_files\\generics.csv";
		List<ProductGenerics> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				ProductGenerics prod = new ProductGenerics(fields[0], Double.parseDouble(fields[1]));
				list.add(prod);
				
				line = br.readLine();
			}
			
			System.out.println("Most expensive:");
			System.out.println(CalculationService.max(list));
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
