package _15_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Produto;
// import util.PriceUpdate;

public class _03_Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("Notebook", 2100.00));
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Case", 80.90));
		list.add(new Produto("Mouse", 50.00));
		
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		
		list.forEach(System.out::println);
	}

}
