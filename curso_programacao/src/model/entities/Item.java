package model.entities;

public class Item {

	// This contains the exercise 1, 2, 3
	
	public String name;
	public double price;
	public int quantity;
	
	public Item(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Item(String name, double price) { // SOBRECARGA DO CONSTRUCTOR
		this.name = name;
		this.price = price;
	}
	
	public double totalValueinStock() {
		return quantity * price;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price)
				+ ", " + quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", totalValueinStock());
	}
}
