package day2;

public class Fahrrad extends Fahrzeug {

	public String marke;

	public Fahrrad() {
		super();
	}
	
	public Fahrrad(String farbe, int baujahr, String marke) {
		super(farbe, baujahr);
		this.marke = marke;
	}

	@Override
	public void fahren() {
		System.out.println("Fahrrad fährt...");
	}

	@Override
	public String toString() {
		return "Fahrrad mit" + super.toString() + ", Marke=" + this.marke;
	}
	
	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}
}