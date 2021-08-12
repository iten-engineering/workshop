package chapter13.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BookDemo {

	public static void main(String[] args) {

		Set<Book> books = new HashSet<Book>();

		books.add(new Book("Faust I", "Goethe", 20000));
		books.add(new Book("Wilhelm Tell", "Schiller", 10000));
		books.add(new Book("Der Untertan", "Mann", 15000));
		books.add(new Book("Die Aula", "Kant", 50000));
		books.add(new Book("Faust II", "Goethe", 20000));
		books.add(new Book("Effi Briest", "Fontane", 10000));

		System.out.println("B�cher:");
		for (Book book : books) {
			System.out.println(" - " + book);
		}

		// Verwaltung in TreeSet
		System.out.println();
		Set<Book> sortedBooks = new TreeSet(books);

		System.out.println("B�cher sortiert:");
		for (Book book : sortedBooks) {
			System.out.println(" - " + book);
		}

	}

}
