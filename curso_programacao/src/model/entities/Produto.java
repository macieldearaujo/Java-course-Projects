package model.entities;

public class Produto {
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
}
