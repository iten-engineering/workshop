package day1;

public class Rechteck {

	public static void main(String[] args) {

		// L�nge und Breite definieren
		int l = 10;
		int b = 3;

		// Umfang und Fl�che berechnen
		int umfang = 2 * l + 2 * b;
		int flaeche = l * b;

		// Ausgabe Resultate
		System.out.printf("Das Rechteck mit L�nge %d und Breite %d hat:%n", l,
				b);
		System.out.printf("Umfang = %d %n", umfang);
		System.out.printf("Fl�che = %d %n", flaeche);
	}
}
