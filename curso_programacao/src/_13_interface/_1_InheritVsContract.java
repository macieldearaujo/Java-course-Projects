package _13_interface;

import model.entities.Abst_Forma;
import model.entities.Circulo;
import model.entities.Retangulo;
import model.enums.Color;

public class _1_InheritVsContract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abst_Forma s1 = new Circulo(Color.BLACK, 2.0);
		Abst_Forma s2 = new Retangulo(Color.BLUE, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
	}
}
