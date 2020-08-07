package features.java12;

import java.util.ArrayList;
import java.util.List;

public class StringDemo12 {

	public static void main(String[] args) {

		System.out.println("ident:");
		String result = "foo\nbar\nbar2".indent(4);
		System.out.println(result);
		System.out.println();

		System.out.println("transform:");
		List<String> rawNames = List.of("Hello ", "  greta  ");
		List<String> transformedNames = new ArrayList<>();
		for (String name : rawNames) {
			String transformedName = name.transform(String::strip).transform(String::toUpperCase);

			transformedNames.add(transformedName);
		}
		System.out.println(transformedNames);

	}

}
