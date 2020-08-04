package meteo.m3;

import java.util.Arrays;

public class MeteoTest {

	public static void main(String[] args) {
		double[] temperaturen = { -8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, -6.3 };
		Meteo meteo = new Meteo(temperaturen);

		System.out.println("OOP Meteo:");
		printTemperaturen(meteo);

		System.out.println("Kenntage:");
		printKenntage(meteo);
	}

	public static void printTemperaturen(Temperaturen meteo) {
		System.out.println("- Temp = " + Arrays.toString(meteo.getTemperaturen()));
		System.out.println("- Min = " + meteo.getMin());
		System.out.println("- Med = " + meteo.getMittelWert());
		System.out.println("- Max = " + meteo.getMax());
	}

	public static void printKenntage(Kenntage meteo) {
		if (meteo.isTropenNacht()) {
			System.out.println("- Tropennacht");
		}
		if (meteo.isVegetationsTag()) {
			System.out.println("- Vegetationstag");
		}
		if (meteo.isFrostTag()) {
			System.out.println("- Frosttag");
		}
		if (meteo.isHeizTag()) {
			System.out.println("- Heiztag");
		}
		if (meteo.isWuestenTag()) {
			System.out.println("- Wüstentag");
		}
		if (meteo.isHeisserTag()) {
			System.out.println("- Heisser Tag");
		}
		if (meteo.isSommerTag()) {
			System.out.println("- Sommertag");
		}
		if (meteo.isEisTag()) {
			System.out.println("- Eistag");
		}
	}

}
