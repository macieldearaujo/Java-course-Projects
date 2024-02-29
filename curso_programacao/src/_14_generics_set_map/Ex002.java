package _14_generics_set_map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: "); //C:\\temp\\testing_files\\votes.csv
		String path = sc.next();
		
		Map<String, Integer> voters = new LinkedHashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				
				if(!voters.containsKey(fields[0])) {
					voters.put(fields[0], Integer.parseInt(fields[1]));
				} else {
					int votes = voters.get(fields[0]);
					voters.put(fields[0], votes + Integer.parseInt(fields[1]));
				}						
				
				line = br.readLine();
			}
			
			for(String name : voters.keySet()) {
				System.out.println(name + ": " + voters.get(name));
			}			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}