package meteo.m1;

import java.util.Arrays;

public class Meteo {

	public static void main(String[] args) {

		double temperaturen[] = { -8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, -6.3 };

		double min = temperaturen[0];
		double max = temperaturen[0];
		double sum = temperaturen[0];

		for (int i = 1; i < temperaturen.length; i++) {
			double t = temperaturen[i];
			if (min > t) {
				min = t;
			}
			if (max < t) {
				max = t;
			}
			sum = sum + t;
		}

		double med = sum / temperaturen.length;

		System.out.println("Classic Meteo:");
		System.out.println("- Temp = " + Arrays.toString(temperaturen));
		System.out.println("- Min  = " + min);
		System.out.println("- Med  = " + med);
		System.out.println("- Max  = " + max);

		System.out.println("Kenntage:");
		// Tmin > = 20 Grad Celsius: Tropennacht
		// Tmin > = 5 Grad Celsius: Vegetationstag
		// Tmin < 0 Grad Celsius: Frosttag
		if (min >= 20) {
			System.out.println("- Tropennacht");
		} else if (min >= 5) {
			System.out.println("- Vegetationstag");
		} else if (min < 0) {
			System.out.println("- Frosttag");
		}

		// Tmed < 12 Grad: Celcius Heiztag
		if (med < 12) {
			System.out.println("- Heiztag");
		}

		// Tmax > = 35 Grad Celsius: Wüstentag
		// Tmax > = 30 Grad Celsius: Heisser Tag
		// Tmax > = 25 Grad Celsius: Sommertag
		// Tmax < 0 Grad Celsius: Eistag
		if (max >= 35) {
			System.out.println("- Wüstentag");
		} else if (max >= 30) {
			System.out.println("- Heisser Tag");
		} else if (max >= 25) {
			System.out.println("- Sommertag");
		} else if (max < 0) {
			System.out.println("- Eistag");
		}

	}

}
