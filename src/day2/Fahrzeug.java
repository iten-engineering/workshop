package day2;

public abstract class Fahrzeug {

	private String farbe;
	private int baujahr;
	
	public Fahrzeug() {
		super();
	}
	
	public Fahrzeug(String farbe, int baujahr) {
		this.farbe = farbe;
		this.baujahr = baujahr;
	}
	
	public abstract void fahren();

	public String toString() {
		return "Farbe=" + this.farbe + ", Baujahr=" + this.baujahr;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public int getBaujahr() {
		return baujahr;
	}

	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
	
}
