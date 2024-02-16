package _10_polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Abs_rectangle;
import model.entities.Circle;
import model.entities.Shape;
import model.enums.Color;

public class Program_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n ;i++) {
			System.out.println("Shape #" + (i+1) + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char shape = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(shape == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Heigth: ");
				double heigth = sc.nextDouble();
				Shape rectangle = new Abs_rectangle(color, width, heigth);
				list.add(rectangle);
			} else if (shape == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				Shape circle = new Circle(color, radius);
				list.add(circle);
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for(Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}

}
