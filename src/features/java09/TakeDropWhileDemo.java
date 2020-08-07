package features.java09;

import java.util.stream.Stream;

public class TakeDropWhileDemo {

	public static void main(String[] args) {

		Stream<String> words = Stream.of("<body>", "<h1>", "Welcome", "to", "this", "course", "</h1>", "<p>",
				"In this course...", "</p>", "</body>");

		words.dropWhile(str -> !str.startsWith("<h1>")).skip(1).takeWhile(str -> !str.startsWith("</h1>"))
				.forEach(System.out::println);

	}

}
