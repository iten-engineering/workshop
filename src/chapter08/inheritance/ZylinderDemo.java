package chapter08.inheritance;

public class ZylinderDemo {

	public static void main(String[] args) {
		
		Kreis k = new Kreis(2);
		Zylinder z = new Zylinder(2, 5);
		
		System.out.println(k.toString());
		System.out.println(z.toString());
	}

}
