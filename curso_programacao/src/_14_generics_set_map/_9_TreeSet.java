package _14_generics_set_map;

import java.util.Set;
import java.util.TreeSet;

import model.entities.Tv;

public class _9_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Tv> set = new TreeSet<>();
		
		set.add(new Tv("Samsung", 1400.00, 1));
		set.add(new Tv("LG", 2100.00, 3));
		set.add(new Tv("LCD", 3400.00, 2));
		
		for(Tv prod : set) { // Use Comparable<Obj> to sort instances
			System.out.println(prod);
		}
	}

}
