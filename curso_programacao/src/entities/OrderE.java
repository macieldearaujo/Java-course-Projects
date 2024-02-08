package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class OrderE {
	private Date moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> products = new ArrayList<>();

	private SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	private SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public OrderE(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public List<OrderItem> getProducts() {
		return products;
	}

	public void addItem(OrderItem item) {
		products.add(item);
	}
	
	public void removeItem(OrderItem item) {
		products.remove(item);
	}
	
	public Double total() {
		Double sum = 0.00;
		for(OrderItem oi : products) {
			sum += oi.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder st = new StringBuilder();
		st.append("ORDER SUMARY:\n");
		st.append("Order moment: " + sdf2.format(moment) + "\n");
		st.append("Order statud: " + status + "\n");
		st.append("Client: " + client.getName() + " (" + sdf1.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
		st.append("Order client:\n");
		for(OrderItem oi : products) {
			st.append(oi.getProduct().getName() + " $" + String.format("%.2f", oi.getPrice()) + " Quantity: " + oi.getQuantity() + ", Subtotal: $" + String.format("%.2f", oi.subTotal()) + "\n");
		}
		st.append("Total price: " + String.format("%.2f", total());
		return st.toString();
	}
}
