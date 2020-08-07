package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PersonReader {

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public List<Person> readPersons() throws IOException {
		List<Person> persons = new ArrayList<>();

		do {
			Person p = readPerson();
			persons.add(p);

		} while (readOneMore());

		return persons;
	}

	private boolean readOneMore() throws IOException {
		String answer = read("Weitere Person erfassen (j/n): ");

		if (answer.trim().equals("j")) {
			return true;
		}

		return false;
	}

	private Person readPerson() throws IOException {
		String firstname;
		String lastname;
		Integer year = null;

		System.out.println("Geben Sie bitte eine Person ein:");
		firstname = read("Vorname  = ");
		lastname = read("Nachname = ");
		year = readAsInt("Jahrgang = ");

		return new Person(firstname, lastname, year);
	}

	private String read(String prompt) throws IOException {
		System.out.print(prompt);
		return reader.readLine();
	}

	private Integer readAsInt(String prompt) throws IOException {
		return Integer.valueOf(read(prompt));
	}

}
