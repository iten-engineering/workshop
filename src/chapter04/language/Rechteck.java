package chapter04.language;

import java.util.Iterator;

public class Rechteck {

	public static void main(String[] args) {	
		int l = 5;
		int b = 10;		

		int umfang = l * 2 + b * 2;
		int flaeche = l * b;	

		System.out.printf("Das Rechteck mit Länge %s und Breite %s hat: %n", l, b);
		System.out.println("Umfang = " + umfang);
		System.out.println("Fläche = " + flaeche);
	}

}
