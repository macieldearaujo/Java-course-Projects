package _15_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.entities.Produto;

public class _01_Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Produto> list = new ArrayList<>();

		Produto p1 = new Produto("Tv", 1200.0);
		Produto p2 = new Produto("Notebook", 2400.0);
		Produto p3 = new Produto("Tablet", 2000.0);

		list.add(p1);
		list.add(p2);
		list.add(p3);

		Comparator<Produto> comp = (o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
		
		list.sort(comp);

		for (Produto prod : list) {
			System.out.println(prod);
		}
	}
}