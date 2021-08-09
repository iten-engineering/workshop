package oo;

public class Kunde extends Person {
	private Integer kundenNr;
	
	public Kunde(String name, Integer jahrgang, Integer kundenNr) {
		super(name, jahrgang);
		this.kundenNr = kundenNr;
	}

	public String toString( ) {
		return super.toString() + ", kundenNr=" + this.kundenNr;
	}
	
}
