package _14_generics_set_map;

import java.util.HashSet;
import java.util.Set;

public class _7_Set {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>(); // HashSet, TreeSet and LinkedSet
		
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}
	}
}
