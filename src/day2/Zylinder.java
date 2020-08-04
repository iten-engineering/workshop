package day2;

public class Zylinder extends Kreis {

	private double hoehe;
	
	public Zylinder() {
		super();
	}
	
	public Zylinder (double radius, double hoehe) {
		super(radius);
		this.hoehe = hoehe;
	}
	
	public double getVolumen() {
		return this.getFlaeche() * this.hoehe;
	}
	
	public String toString() {
		return "Zylider mit Radius=" + this.getRadius() + ", Höhe=" + this.hoehe + ", Volumen=" + this.getVolumen() ; 
	}

	public double getHoehe() {
		return hoehe;
	}

	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}

}
