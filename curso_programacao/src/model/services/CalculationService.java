package model.services;

import java.util.List;

public class CalculationService<T> {

	public static <T extends Comparable<T>> T max(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalAccessError("List can't be empty");
		}
		
		T bigger = list.get(0);
		for(T item : list) {
			if(item.compareTo(bigger) > 0) {
				bigger = item;
			}
		}
		return bigger;
	}
}
