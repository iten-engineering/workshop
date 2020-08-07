package features.java10;

import java.util.Map;

public class VarDemo2 {

	public static void main(String[] args) {

		// Map<Integer, String>
		var articles = Map.of(1, "PC", 2, "Mouse", 3, "Coffee");

		// Set<Map.Entry<Integer, String>>
		var entries = articles.entrySet();
		for (var e : entries) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}
	}

}
