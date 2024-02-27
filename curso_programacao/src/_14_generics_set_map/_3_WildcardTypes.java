package _14_generics_set_map;

import java.util.Arrays;
import java.util.List;

public class _3_WildcardTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> myInts = Arrays.asList(2, 4, 6, 7);
		List<String> myStrings = Arrays.asList("Ana", "Maria", "Julia");
		printList(myInts);
		printList(myStrings);
	}

	public static void printList(List<?> list) {
			for(Object obj : list) {
				System.out.println(obj);
			}
		}
}