package util;

import java.util.function.Consumer;

import model.entities.Produto;

public class PriceUpdate implements Consumer<Produto> {

	@Override
	public void accept(Produto prod) { // Interface implementation
		prod.setPrice(prod.getPrice() * 1.1);
	}

}
