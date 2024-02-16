package model.entities;

import java.util.Date;

public class Order {

	/* private: o membro só pode ser acessado na própria classe;
	(nada): o membro só pode ser acessado nas classes do mesmo pacote;
	protected: o membro só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes;
	public: o membro é acessado em todas as classes, a menos que seja em módulo diferente.
	*/
	
	private Date date;
	private Product product;
	
	public Order(Date date, Product product) {
		this.date = date;
		this.product = product;
		this.product.name = "TV";
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
}
