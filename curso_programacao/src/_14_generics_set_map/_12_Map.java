package _14_generics_set_map;

import java.util.Map;
import java.util.TreeMap;

import model.entities.Produto;

public class _12_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Produto, Integer> cookies = new TreeMap<>();
		
		Produto p1 = new Produto("Tv", 900.00);
		Produto p2 = new Produto("Notebook", 1200.00);
		Produto p3 = new Produto("Tablet", 400.00);
		
		cookies.put(p1, 10000);
		cookies.put(p2, 20000);
		cookies.put(p3, 15000);
		
		Produto ps = new Produto("Notebook", 1200.00);
		
		System.out.println("Contains 'ps' key: " + cookies.containsKey(ps));
		
		for(Produto prod : cookies.keySet()) {
			System.out.println(prod.getName() + ": " + prod.getPrice() + " - stock quantity: " + cookies.get(prod));
		}
	}
}
