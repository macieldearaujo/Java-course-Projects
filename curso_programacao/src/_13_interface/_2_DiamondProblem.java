package _13_interface;

import model.entities.ComboDevice;

public class _2_DiamondProblem {

	public static void main(String[] args) {

		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation"); // Diamond problem, you can extends more than 1 superclass
		c.print("My dissertation");
		System.out.println("Scanner result: " + c.scan());
		
	}
}