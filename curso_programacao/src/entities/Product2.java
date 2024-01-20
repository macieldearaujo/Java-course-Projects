package entities;

public class Product2 {

	// This contains the exercise 1, 2, 3
	
	private String name;
	private  double price;
	public int quantity;
	
	public Product2(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product2(String name, double price) { // SOBRECARGA DO CONSTRUCTOR
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setPrice(double price) {
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
		return this.name 
				+ ", $ " 
				+ String.format("%.2f", price)
				+ ", " + quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", totalValueinStock());
	}
}
