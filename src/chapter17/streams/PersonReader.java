package chapter17.streams;

import java.util.ArrayList;
import java.util.List;

import util.Reader;

public class PersonReader {

	public List<Person> readPersons() {
		List<Person> persons = new ArrayList<>();
		
		do {
			Person person = readPerson();
			persons.add(person);
		
		} while ( readMorePersons() );
		
		return persons;
	}
	
	private boolean readMorePersons() {
		String input = Reader.readln("Weitere Person erfassen j/n? ");

		if (input.trim().toLowerCase().equals("j")) {
			return true;
		}
		
		return false;
	}
	
	private Person readPerson() {
		
		System.out.println("Bitte geben Sie eine Person ein");
		
		String firstname = Reader.readln("Vorname  = ");
		String lastname = Reader.readln("Nachname = ");
		Integer yearOfBirth = Reader.readInt("Jahrgang = ");
		
		return new Person(firstname, lastname, yearOfBirth);
	}
	
	
}
