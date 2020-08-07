package day5;

import java.io.FileWriter;
import java.util.List;

public class PersonWriter {

	public static final String DEFAULT_FILENAME = "personen.txt";

	private String filename = DEFAULT_FILENAME;

	public PersonWriter() {
		super();
	}

	public PersonWriter(String filename) {
		this.filename = filename;
	}

	public void writePersons(List<Person> persons) {

		try (FileWriter fw = new FileWriter(this.filename)) {

			System.out.println("Schreibe Personen in die Datei " + this.filename);
			for (Person person : persons) {
				fw.write(person.toString());
				fw.write("\n");
				System.out.println("  - " + person);
			}

		} catch (Exception e) {
			System.out.println("PersonWriter Ausgabefehler: " + e.toString());
		}

	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

}
