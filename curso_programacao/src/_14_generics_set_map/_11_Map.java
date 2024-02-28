package _14_generics_set_map;

import java.util.Map;
import java.util.TreeMap;

public class _11_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		cookies.remove("email");
		cookies.put("phone", "99711133"); // overlay - the last value
		
		System.out.println("ALL COOKIES:");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
