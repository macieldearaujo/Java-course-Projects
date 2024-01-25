package _07_arrays_lists_memory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Maria");
		list.add("Isabelly");
		list.add("Arthur"); 
		list.add(2, "Marco");
		
		//list.remove("Maria");
		System.out.println(list.size());
		for(String item : list) {
			System.out.println(item);
		} 
		System.out.println("--------------------");
		list.removeIf(x -> x.charAt(0) == 'A');
		for(String item : list) {
			System.out.println(item);
		}
		System.out.println("--------------------");
		System.out.println("Index of: " + list.indexOf("Isabelly"));
		System.out.println("Index of: " + list.indexOf("doesNotExist")); // return -1
		
		System.out.println("--------------------");
		//                   convert to stream           predicate               convert to list again
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList()); // You are able to use "toList()" directly.
		
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(name);
	}

}
