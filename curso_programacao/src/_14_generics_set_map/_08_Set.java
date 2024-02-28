package _14_generics_set_map;

import java.util.HashSet;
import java.util.Set;

import model.entities.Product;

public class _08_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Product> set = new HashSet<>();
		set.add(new Product("Tv", 2000.00, 2));
		set.add(new Product("Notebook", 1200.00, 1)); // contains hashCode and equals
		set.add(new Product("Tablet", 1600, 4));
		
		Product p1 = new Product("Notebook", 1200.00, 1);
		
		System.out.println(set.contains(p1));
	}
}
