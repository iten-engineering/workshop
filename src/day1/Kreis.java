package day1;

public class Kreis {

	public double radius;

	public double getUmfang() {
		return 2 * radius * Math.PI;
	}

	public double getFlaeche() {
		return radius * radius * Math.PI;
	}

	public void print() {
		System.out.println("Kreis mit Radius " + radius);
		System.out.println("- Umfang = " + getUmfang());
		System.out.println("- Fläche = " + getFlaeche());
	}

}
