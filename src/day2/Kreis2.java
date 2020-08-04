package day2;

public class Kreis2 {

	private double radius;
	private boolean sichtbar;
	
	// ---------------------------------------------------------------------
	// Konstruktoren
	// ---------------------------------------------------------------------

	public Kreis2() {
		super();
	}

	public Kreis2(double radius) {
		this.radius = radius;
	}
	
	public Kreis2(double radius, boolean sichtbar) {
		this.radius = radius;
		this.sichtbar = sichtbar;
	}
	
	// ---------------------------------------------------------------------
	// Methoden
	// ---------------------------------------------------------------------

	public double getUmfang() {
		return 2 * radius * Math.PI;
	}

	public double getFlaeche() {
		return radius * radius * Math.PI;
	}

	public void print() {
		System.out.println("Kreis mit Radius " + radius + " und sichtbar=" + sichtbar);
		System.out.println("- Umfang = " + getUmfang());
		System.out.println("- Fläche = " + getFlaeche());
	}

	// ---------------------------------------------------------------------
	// Getter und Setter
	// ---------------------------------------------------------------------

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public boolean isSichtbar() {
		return sichtbar;
	}

	public void setSichtbar(boolean sichtbar) {
		this.sichtbar = sichtbar;
	}

}
