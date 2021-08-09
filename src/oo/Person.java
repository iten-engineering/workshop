package oo;

public class Person {

	private String name;
	private Integer jahrgang;

	public Person(String name, Integer jahrgang) {
		this.name = name;
		this.jahrgang = jahrgang;
	}
	
	@Override
	public String toString() {
		return this.name + " mit Jahrgang=" + this.jahrgang;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getJahrgang() {
		return jahrgang;
	}

	public void setJahrgang(Integer jahrgang) {
		this.jahrgang = jahrgang;
	}
	
	
	
}
