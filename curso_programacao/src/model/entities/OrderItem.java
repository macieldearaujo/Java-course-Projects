package model.entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private ProductE product;
	
	public OrderItem() {
	}
	
	public OrderItem(Integer quantity, Double price, ProductE product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public ProductE getProduct() {
		return product;
	}

	public void setProduct(ProductE product) {
		this.product = product;
	}

	public Double subTotal() {
		return quantity * price;
	}
}
