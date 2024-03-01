package util;

import java.util.function.Function;

import model.entities.Produto;

public class NameUpperCase implements Function<Produto, String> {

	@Override
	public String apply(Produto p) {
		return p.getName().toUpperCase();
	}
}
