package day5;

import java.io.IOException;
import java.util.List;

public class PersonDemo {

	public static void main(String[] args) throws IOException {

		List<Person> persons;

		// Personen einlesen
		PersonReader reader = new PersonReader();
		persons = reader.readPersons();

		// Personen schrieben
		PersonWriter writer = new PersonWriter();
		writer.writePersons(persons);

	}

}
