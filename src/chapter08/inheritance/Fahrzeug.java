package chapter08.inheritance;

public abstract class Fahrzeug {
	private String farbe;
	private int baujahr;
	
	public Fahrzeug(String farbe, int baujahr) {
		super();
		this.farbe = farbe;
		this.baujahr = baujahr;
	}
	
	@Override
	public String toString() {
		return "Farbe=" + farbe + ", Baujahr=" + baujahr;
	}
	
	public abstract void fahren();

}
