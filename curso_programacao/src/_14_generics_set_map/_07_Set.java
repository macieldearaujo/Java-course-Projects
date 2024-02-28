package _14_generics_set_map;

import java.util.HashSet;
import java.util.Set;

public class _07_Set {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>(); // HashSet, TreeSet and LinkedSet
		
		set.add("Tv"); // Is similar to list
		set.add("Notebook");
		set.add("Tablet");
		
		set.removeIf(x -> x.charAt(0) == 'T'); // predicate
		
		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}
	}
}
