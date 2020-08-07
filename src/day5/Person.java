package day5;

public class Person {

	private String firstname;
	private String lastname;
	private Integer year;

	public Person() {
		super();
	}

	public Person(String firstname, String lastname, Integer year) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.year = year;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(this.firstname);
		sb.append(" ");
		sb.append(this.lastname);
		sb.append(", ");
		sb.append(this.year);

		return sb.toString();
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	
}
