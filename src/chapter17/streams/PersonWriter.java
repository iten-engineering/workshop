package chapter17.streams;

import java.io.FileWriter;
import java.util.List;

public class PersonWriter {
	
	private String filename;
	
	public PersonWriter(String filename) {
		this.filename = filename;
	}
	

	public void writePersons(List<Person> persons) {

		System.out.println("Write persons to file: " + this.filename);
		
		try (FileWriter writer = new FileWriter(filename)) {

			for (Person person : persons) {
				writer.write(person.toString());
			}
			
		} catch (Exception e) {
			System.out.println("Write persons failed with: " + e.toString());
		}
	}
	
}
