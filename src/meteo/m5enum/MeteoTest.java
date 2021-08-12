package meteo.m5enum;

import java.util.Arrays;
import java.util.List;

public class MeteoTest {

	/**
	 * Test für die Klasse Meteo.
	 */
	public static void main(String[] args) {
		double[] temperaturen = { -8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, -6.3 };
		Meteo meteo = new Meteo(temperaturen);

		System.out.println("OOP Meteo:");
		printTemperturen(meteo);
		
		System.out.println("Kenntage:");
		printKenntage(meteo.getKenntage());	
	}

	public static void printTemperturen(Temperaturen temp) {
		System.out.println("- Temp = " + Arrays.toString(temp.getTemperaturen()));
		System.out.println("- Min  = " + temp.getMin());
		System.out.println("- Med  = " + temp.getMittelWert());
		System.out.println("- Max  = " + temp.getMax());
	}
	
	public static void printKenntage (List<Kenntag> kenntage) {
		for (Kenntag kenntag : kenntage) {
			System.out.println("- " + kenntag.getName());
		}
	}
	
} // end
