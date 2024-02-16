package model.entities;

import model.enums.Color;

public class Abs_rectangle extends Shape{

	private Double width;
	private Double heigth;
	
	public Abs_rectangle() {
		super();
	}
	
	public Abs_rectangle(Color color, Double width, Double heigth) {
		super(color);
		this.width = width;
		this.heigth = heigth;
	}



	@Override
	public Double area() {
		return width * heigth;
	}
	
	
}
