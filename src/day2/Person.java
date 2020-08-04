package day2;

public class Person {

	private String vorname;
	private String nachname;

	
	public Person() {
		super();
	}
	
	public Person(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	public String toString() {
		return this.vorname + " " + this.nachname;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public String getNachname() {
		return nachname;
	}
	
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
}
