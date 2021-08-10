package chapter08.inheritance;

import java.util.ArrayList;
import java.util.List;

public class FahrzeugDemo {

	public static void main(String[] args) {
		
		List<Fahrzeug> fahrzeuge = new ArrayList<>();
		fahrzeuge.add( new Fahrrad("schwarz", 2020, "Scott"));
		fahrzeuge.add( new PKW("gelb", 2021, 5));
		
		
		for (Fahrzeug fahrzeug : fahrzeuge) {
			fahrzeug.fahren();
		}
	}

}
