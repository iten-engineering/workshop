package features.java10;

import java.util.ArrayList;

public class VarDemo {

	/**
	 * With the 'var' keyword you can define a variable without explicit type
	 * definition. The type is determined by type of the assigned instance.
	 */
	public static void main(String[] args) {

		var hello = "Hello";
		var names = new ArrayList<String>();
		names.add("Zoé");
		names.add("Tim");

		System.out.print(hello);
		for (String name : names) {
			System.out.print(" " + name);
		}
		System.out.println();

		System.out.println("hello instanceof String    : " + (hello instanceof String));
		System.out.println("names instanceof ArrayList : " + (names instanceof ArrayList));
	}

}
