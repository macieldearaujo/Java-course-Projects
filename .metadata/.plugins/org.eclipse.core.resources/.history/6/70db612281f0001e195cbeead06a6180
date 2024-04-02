package _15_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Produto;

public class _02_Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("Notebook", 2100.00));
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Case", 80.90));
		list.add(new Produto("Mouse", 50.00));
		
		list.removeIf(Produto::nonStaticProductPredicate); // list.removeIf(x -> x <= 100)
		
		for(Produto prod : list) {
			System.out.println(prod);
		}
	}

}
