package model.entities;

import java.util.Objects;

public class Tv implements Comparable<Tv> {

	private String name;
	private Double price;
	private Integer quantity;
	
	public Tv(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tv other = (Tv) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(quantity, other.quantity);
	}
	
	public String toString() {
		return "Produto [name=" + getName() + ", price=" + getPrice() + ", quantity=" + getQuantity() + "]";
	}

	@Override
	public int compareTo(Tv other) {
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}
}
