package chapter08.inheritance;

public class PKW extends Fahrzeug {
	private int sitze;
	
	public PKW(String farbe, int baujahr, int sitze) {
		super(farbe, baujahr);
		this.sitze = sitze;
	}

	@Override
	public String toString() {
		return super.toString() + ", Sitzplätze=" + sitze;
	}
	
	@Override
	public void fahren() {
		System.out.println("PKW " + toString() + ": fährt...");
	}
	

}
