package chapter07.encapsulation;

public class Kreis2 {

	private float radius;
	private boolean visible;
	
	public Kreis2() {
		super();
	}

	public Kreis2(float radius) {
		super();
		this.radius = radius;
	}

	public Kreis2(float radius, boolean visible) {
		super();
		this.radius = radius;
		this.visible = visible;
	}

	public double getUmfang() {
		return 2 * radius * Math.PI;
	}

	public double getFlaeche() {
		return radius * radius * Math.PI;
	}

	public void print() {
		System.out.println("Kreis mit radius=" + radius + ", visible=" + visible);
		System.out.println("- Umfang = " + getUmfang());
		System.out.println("- Fläche = " + getFlaeche());
	}
	
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
}
