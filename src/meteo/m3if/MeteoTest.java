package meteo.m3if;
import java.util.Arrays;

public class MeteoTest {

	public static void main(String[] args) {
		double[] temperaturen = { -8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, -6.3 };
		Meteo meteo = new Meteo(temperaturen);
		
		System.out.println("Temperaturen:");
		printTemeperaturen(meteo);
		
		System.out.println("Kenntage:");
		printKenntage(meteo);
	}

	public static void printTemeperaturen(Temperaturen t) {		
		System.out.println("- Temp = " + Arrays.toString(t.getTemperaturen()));
		System.out.println("- Min = " + t.getMin());
		System.out.println("- Med = " + t.getMittelWert());
		System.out.println("- Max = " + t.getMax());
	}
	
	public static void printKenntage(Kenntage k) {
		if (k.isTropenNacht()) {
			System.out.println("- Tropennacht");
		}
		if (k.isVegetationsTag()) {
			System.out.println("- Vegetationstag");
		}
		if (k.isFrostTag()) {
			System.out.println("- Frosttag");
		}
		if (k.isHeizTag()) {
			System.out.println("- Heiztag");
		}
		if (k.isWuestenTag()) {
			System.out.println("- Wüstentag");
		}
		if (k.isHeisserTag()) {
			System.out.println("- Heisser Tag");
		}
		if (k.isSommerTag()) {
			System.out.println("- Sommertag");
		}
		if (k.isEisTag()) {
			System.out.println("- Eistag");
		}
	}
	
}
