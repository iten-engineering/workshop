package chapter17.streams;

public class Person {

	private String firstname;
	private String lastname;
	private Integer yearOfBirth;

	public Person() {
		super();
	}

	public Person(String firstname, String lastname, Integer yearOfBirth) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.yearOfBirth = yearOfBirth;
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", yearOfBirth=" + yearOfBirth + "]";
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

	public Integer getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

}
