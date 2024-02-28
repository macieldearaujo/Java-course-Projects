package _14_generics_set_map;

import java.util.ArrayList;
import java.util.List;

import model.entities.Circulo2;
import model.entities.Formato;
import model.entities.Retangulo2;

public class _04_BoundedWildcardTypes {

	public static void main(String[] args) {

		List<Formato> myShapes = new ArrayList<>();
		myShapes.add(new Retangulo2(3.0, 2.0));
		myShapes.add(new Circulo2(2.0));
		
	}
	
	public static double totalArea(List<? extends Formato> list) {
		Double sum = 0.0;
		
		for(Formato value : list) {
			sum += value.area();
		}
		return sum;
	}

}
