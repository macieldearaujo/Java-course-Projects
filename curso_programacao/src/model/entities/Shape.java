package model.entities;

import model.enums.Color;

public abstract class Shape {
	
	private Color color;
	
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getName() {
		return color;
	}

	public void setName(Color color) {
		this.color = color;
	}
	
	public abstract Double area();
	
}
