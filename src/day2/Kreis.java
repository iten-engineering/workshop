package day2;

public class Kreis {

	private double radius;
	
	public Kreis() {
		super();
	}

	public Kreis(double radius) {
		this.radius = radius;
	}
	
	public double getUmfang() {
		return 2 * radius * Math.PI;
	}

	public double getFlaeche() {
		return radius * radius * Math.PI;
	}

	public String toString() {
		return "Kreis mit Radius=" + this.radius + ", Umfang=" + this.getUmfang() + ", Fläche=" + this.getFlaeche(); 
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
