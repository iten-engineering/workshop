package chapter05.ctrl;

import util.Reader;

public class Note {

	public static void main(String[] args) {

		int note = Reader.readInt("Bitte geben sie eine Note zwischen 1-6 ein:");
		
		// Eingabe Validierung
		if (note <1 || note>6) {
			System.out.println("Keine gültiger Wert, bitte geben sie eine Zahl zwischen 1-6 ein!");
			System.exit(-1);
		}

		// Verarbeitung
		if (note >= 4) {
			System.out.println("Test bestanden");
		} else {
			System.out.println("Test leider nicht bestanden");			
		}
		
		switch (note) {
			case 6: 
				System.out.println("Note 6: sehr gut");
				break;
			case 5: 
				System.out.println("Note 5: gut");
				break;
			case 4: 
				System.out.println("Note 4: genügend");
				break;
		
			default:
				System.out.println("ungenügend");
		}
	}

}
