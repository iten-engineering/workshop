package chapter08.inheritance;

public class Fahrrad extends Fahrzeug {
	private String marke;
	
	public Fahrrad(String farbe, int baujahr, String marke) {
		super(farbe, baujahr);
		this.marke = marke;
	}

	@Override
	public String toString() {
		return super.toString() + ", Marke=" + marke;
	}
	
	@Override
	public void fahren() {
		System.out.println("Fahrrad " + toString() + ": fährt...");
	}
	
	

}
