package day2;

public class PKW extends Fahrzeug {

	int sitzplaetze;
	
	public PKW() {
		super();
	}
	
	public PKW(String farbe, int baujahr, int sitzplaetze) {
		super(farbe, baujahr);
		this.sitzplaetze = sitzplaetze;
	}

	@Override
	public void fahren() {
		System.out.println("PKW fährt...");
	}
	@Override
	public String toString() {
		return "PKW mit " + super.toString() + ", Sitzplätze=" + this.sitzplaetze;
	}

	public int getSitzplaetze() {
		return sitzplaetze;
	}

	public void setSitzplaetze(int sitzplaetze) {
		this.sitzplaetze = sitzplaetze;
	}
	
	
	
	
}
