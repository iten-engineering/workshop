package meteo.m5;

import java.util.Arrays;
import java.util.List;

public class MeteoTest {

	public static void main(String[] args) {
		double[] temperaturen = { -8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, -6.3 };
		Meteo meteo = new Meteo(temperaturen);

		System.out.println("OOP Meteo:");
		printTemperaturen(meteo);

		System.out.println("Kenntage:");
		printKenntage(meteo.getKenntage());
	}

	public static void printTemperaturen(Temperaturen meteo) {
		System.out.println("- Temp = " + Arrays.toString(meteo.getTemperaturen()));
		System.out.println("- Min = " + meteo.getMin());
		System.out.println("- Med = " + meteo.getMittelWert());
		System.out.println("- Max = " + meteo.getMax());
	}

	public static void printKenntage(List<Kenntag> kenntage) {
		for (Kenntag k : kenntage) {
			System.out.println("- " + k.getName());
		}
	}

}
