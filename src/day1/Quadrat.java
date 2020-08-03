package day1;

public class Quadrat {

	public static void main(String[] args) {

		int zahl = 1;
		int quadrat = zahl * zahl;

		while (quadrat <= 15) {
			System.out.println(zahl + " x " + zahl + " = " + quadrat);

			zahl++;
			quadrat = zahl * zahl;
		}

	}

}
