package day1.oo;

public class Person {

	private String name;
	private int jahrgang;

	public Person() {
		super();
	}

	public Person(String name, int jahrgang) {
		super();
		this.name = name;
		this.jahrgang = jahrgang;
	}

	@Override
	public String toString() {
		return this.name + " mit Jahrgang " + this.jahrgang;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJahrgang() {
		return jahrgang;
	}

	public void setJahrgang(int jahrgang) {
		if (jahrgang < 0) {
			throw new RuntimeException("Ungültiger Jahrgang");
		}
		this.jahrgang = jahrgang;
	}

}
