package _07_arrays_lists_memory;

public class Program_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 20;
		
		Object obj = x; // Boxing
		
		System.out.println(obj);
		
		int y = (int) obj; // Unboxing
		System.out.println(y);
		
		Integer obj2 = x; // Wrapper classes - Integer, Byte, Short, Number, Float, Character, etc...
		
		int z = obj2;
		System.out.println();
	}

}
