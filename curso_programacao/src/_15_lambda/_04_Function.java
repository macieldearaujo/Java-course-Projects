package _15_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.entities.Produto;

public class _04_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		List<Produto> list = new ArrayList<>();

		list.add(new Produto("Notebook", 2100.00));
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Case", 80.90));
		list.add(new Produto("Mouse", 50.00));
		
		Function<Produto, String> names = x -> x.getName().toUpperCase(); // HARDCORE
		
		List<String> namesUpperCase = list.stream().map(names).collect(Collectors.toList()); // to use map() you need to convert the list to stream()
		
		namesUpperCase.forEach(System.out::println);
	}

}