package model.entities;

import model.enums.Color;

public abstract class Abst_Forma implements Forma {
	
	private Color color;

	public Abst_Forma(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}	
}
