package chapter17.streams;

import java.util.List;

public class PersonDemo {

	public static void main(String[] args) {
		PersonReader reader = new PersonReader();
		List<Person> persons = reader.readPersons();
		
		PersonWriter writer = new PersonWriter("persons.txt");
		writer.writePersons(persons);
	}

}
