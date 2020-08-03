package day1.oo;

public class Kunde extends Person {

	private int kundenNr;

	public Kunde(String name, int jahrgang, int kundenNr) {
		super(name, jahrgang);
		this.kundenNr = kundenNr;
	}

	@Override
	public String toString() {
		return super.toString() + " KundenNr " + this.kundenNr;
	}

	public int getKundenNr() {
		return kundenNr;
	}

	public void setKundenNr(int kundenNr) {
		this.kundenNr = kundenNr;
	}

}
