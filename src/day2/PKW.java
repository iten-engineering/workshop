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
	public String getType() {
		return "PKW";
	}

	@Override
	public String toString() {
		return "PKW mit " + super.toString() + ", Sitzplštze=" + this.sitzplaetze;
	}

	public int getSitzplaetze() {
		return sitzplaetze;
	}

	public void setSitzplaetze(int sitzplaetze) {
		this.sitzplaetze = sitzplaetze;
	}

}
