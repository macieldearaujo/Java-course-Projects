package model.entities;

import java.util.Objects;

public class Produto implements Comparable<Produto>{
	private String name;
	private Double price;
	
	public Produto() {
	}

	public Produto(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}
	
	public String priceTag() {
		return name + " $ " + String.format("%.2f", price);
	}
	
	public static boolean staticProductPredicate(Produto p) {
		return p.getPrice() >= 100.0;
	}
	
	public boolean nonStaticProductPredicate() { // reference method
		return price >= 100.0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	@Override
	public int compareTo(Produto other) {
		return name.compareTo(other.getName());
	}
	
	@Override
	public String toString() {
		return getName() + " " + String.format("%.2f", getPrice());
	}
}
