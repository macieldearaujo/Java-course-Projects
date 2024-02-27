package model.entities;

public class Retangulo2 implements Formato {

	private Double width;
	private Double height;

	public Retangulo2(Double width, Double height) {
			this.width = width;
			this.height = height;
		}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
}
