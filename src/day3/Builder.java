package day3;

public class Builder {

	public static void main(String[] args) {

		// Parameter einlesen
		String name = "unbekannt";

		if (args.length > 0) {
			name = args[0];
		}

		// string zusammenstellen
		StringBuilder sb = new StringBuilder();

		sb.append("Sehr geehrte(r) Frau/Herr ");
		sb.append(name);
		sb.append("\n");
		sb.append("Wir grautulieren Ihnen ...");

		// ausgabe resultat
		System.out.println(sb.toString());
	}

}
