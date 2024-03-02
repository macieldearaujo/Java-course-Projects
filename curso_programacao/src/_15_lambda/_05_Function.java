package _15_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Produto;
import model.services.ProdutoService;

public class _05_Function {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));
		
		ProdutoService ps = new ProdutoService();
		double result = ps.filteredSum(list, x -> x.getName().charAt(0) == 'T');
		
		System.out.println(String.format("%.2f", result));
	}
}
