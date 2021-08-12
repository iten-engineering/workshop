package chapter13.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Bauernhof {

	public static void main(String[] args) {

		List<String> tiere = new ArrayList<String>();

		tiere.add("Kuh");
		tiere.add("Ziege");
		tiere.add("Huhn");
		tiere.add("Katze");
		tiere.add("Hund");
		tiere.add("Schaf");
		tiere.add("Schwein");

		Iterator<String> i = tiere.iterator();

		System.out.println("Ausgabe mit Iterator:");
		while (i.hasNext()) {
			String tier = i.next();
			System.out.println(" - " + tier);
		}

		System.out.println("Ausgabe sortiert:");
		Collections.sort(tiere);
		for (String tier : tiere) {
			System.out.println(" - " + tier);
		}

		System.out.println("Ausgabe r�ckw�rts:");
		for (int j = tiere.size() - 1; j >= 0; j--) {
			System.out.println(" - " + tiere.get(j));
		}

		// Collections.reverse(tiere);
		// for (String tier : tiere) {
		// System.out.println(" - " + tier);
		// }

	}

}
