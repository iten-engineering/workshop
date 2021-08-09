package chapter05.ctrl;

public class Quadrat {

	public static void main(String[] args) {

		int z = 1;
		int q = z * z;
		
		while (q <= 15) {
			System.out.println(z + " * " + z + " = " + q);
			z++;
			q = z * z;			
		}
		
	}

}
