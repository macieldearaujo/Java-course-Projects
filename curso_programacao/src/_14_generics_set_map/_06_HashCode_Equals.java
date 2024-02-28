package _14_generics_set_map;

import model.entities.Cliente;

public class _06_HashCode_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente c1 = new Cliente("Maria", "maria@gmail.com");
		Cliente c2 = new Cliente("Alex", "alex@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); // Instance
		System.out.println(s1 == s2); // Primitive type
		
	}

}
