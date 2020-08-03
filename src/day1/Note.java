package day1;

public class Note {

	public static void main(String[] args) {

		// Argument einlesen
		if (args.length == 0) {
			System.out
					.println("Falscher Aufruf: Bitte übergeben Sie ein Argument!");
			System.exit(-1);
		}

		int note = Integer.parseInt(args[0]);
		System.out.println("Note = " + note);

		// Wertebereich prüfen
		if ((note < 1) || (note > 6)) {
			System.out
					.println("Falscher Wert: Die Note muss einen Wert zwischen 1..6 haben!");
			System.exit(-2);
		}

		// Wert prüfen
		if (note >= 4) {
			System.out.println("Der Test ist bestanden mit:");
		} else {
			System.out.println("Der Test ist leider nicht bestanden mit:");
		}

		// Detailauswertung
		switch (note) {
		case 6:
			System.out.println("sehr gut");
			System.out.println("Herzliche Gratulation.");
			break;

		case 5:
			System.out.println("gut");
			break;

		case 4:
			System.out.println("genügend");
			break;

		default:
			System.out.println("ungenügend");
			break;
		}

	}

}
