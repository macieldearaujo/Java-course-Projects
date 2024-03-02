package model.services;

import java.util.List;
import java.util.function.Predicate;

import model.entities.Produto;

public class ProdutoService {

	public Double filteredSum(List<Produto> list, Predicate<Produto> criteria) {
		double sum = 0.00;
		for(Produto p : list) {
			if(criteria.test(p)) { // **********
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
