package _14_generics_set_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _05_BoundedWildcardTypes {
	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObj = new ArrayList<>();
		
		copy(myInts, myObj);
		printList(myObj);
		copy(myDoubles, myObj);
		printList(myObj);
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) { //Covariance and contravariance
		for(Number number : source) {
			destiny.add(number); // You modify the original list, because when you pass an object as an argument to a method, you're actually passing a reference to that object.
		}
	}
	
	public static void printList(List<?> list) { //
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		
		System.out.println();
	}
}
