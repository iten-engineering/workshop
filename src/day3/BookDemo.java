package day3;

import java.util.Set;
import java.util.TreeSet;

public class BookDemo {

	public static void main(String[] args) {
		Set<Book> books = new TreeSet<>();

		books.add(new Book("T1", "A1", 1));
		books.add(new Book("T2", "A2", 2));
		books.add(new Book("T3", "A3", 3));

		System.out.println("Bücher");
		for (Book book : books) {
			System.out.println("- " + book);
		}

	}

}
