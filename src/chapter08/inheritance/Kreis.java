package chapter08.inheritance;

public class Kreis {
	
	private double radius;

	public Kreis() {
		super();
	}
	
	public double getUmfang() {
		return 2 * radius * Math.PI;
	}
	
	public double getFlaeche() {
		return radius * radius * Math.PI;
	}	
	
	@Override
	public String toString() {
		return "Kreis mit radius " + radius 
				+ ": Umfang=" + getUmfang() 
				+ ", Fläche=" + getFlaeche();
	}
	
	public Kreis(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
