package features.java09;

import java.util.List;
import java.util.Set;

public class CollectionFactoryDemo {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
		Set<String> words = Set.of("Hello", "World");

		System.out.println(numbers);
		System.out.println(words);

	}

}
