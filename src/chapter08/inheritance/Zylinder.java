package chapter08.inheritance;

public class Zylinder extends Kreis {
	private double height;
	
	public Zylinder() {
		super();
	}
	
	public Zylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	@Override
	public String toString() {
		return "Zylinder mit radius " + this.getRadius() 
				+ " und höhe " + this.getHeight()
				+ ": Volumen=" + getVolumen();
	}
	
	public double getVolumen() {
		return this.height * super.getFlaeche();
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
