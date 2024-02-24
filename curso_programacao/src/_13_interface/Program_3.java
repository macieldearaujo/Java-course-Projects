package _13_interface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Funcionario;

public class Program_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "C:\\temp\\in.csv";
		List<Funcionario> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String funcCsv = br.readLine();
			
			while(funcCsv != null) {
				String[] fields = funcCsv.split(",");
				list.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
				funcCsv = br.readLine();
			}
			
			Collections.sort(list); // alphabetical order
			for(Funcionario s : list) {
				System.out.println(s.getName() + ", " + s.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
