package oo;

public class Mitarbeiter extends Person {
	private Integer lohn;

	public Mitarbeiter(String name, Integer jahrgang, Integer lohn) {
		super(name, jahrgang);
		this.lohn = lohn;
	}

	@Override
	public String toString() {
		
		return super.toString() + ", lohn=" + lohn;
		
	}
}
