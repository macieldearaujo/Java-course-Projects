package _14_generics_set_map;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class _08_SetMethods {

	public static void main(String[] args) {

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		//union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		
		//interception
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
