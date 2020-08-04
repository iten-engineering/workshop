package meteo.m2;

import java.util.Arrays;

public class Meteo {

	private double[] temperaturen;
	private double min;
	private double max;
	private double mittelWert;

	public Meteo(double[] temperaturen) {
		this.temperaturen = temperaturen;
		this.min = temperaturen[0];
		this.max = temperaturen[0];
		double sum = temperaturen[0];

		for (int i = 1; i < temperaturen.length; i++) {
			double t = temperaturen[i];

			min = min < t ? min : t;
			max = max > t ? max : t;
			sum = sum + t;
		}
		this.mittelWert = sum / temperaturen.length;
	}

	// Tmin > = 20 Grad Celsius: Tropennacht
	// Tmin > = 5 Grad Celsius: Vegetationstag
	// Tmin < 0 Grad Celsius: Frosttag
	public boolean isTropenNacht() {
		return (min >= 20);
	}

	public boolean isVegetationsTag() {
		return (min >= 5 && min < 20);
	}

	public boolean isFrostTag() {
		return (min < 0);
	}

	// Tmed < 12 Grad: Celcius Heiztag
	public boolean isHeizTag() {
		return (mittelWert < 12);
	}

	// Tmax > = 35 Grad Celsius: Wüstentag
	// Tmax > = 30 Grad Celsius: Heisser Tag
	// Tmax > = 25 Grad Celsius: Sommertag
	// Tmax < 0 Grad Celsius: Eistag
	public boolean isWuestenTag() {
		return (max >= 35);
	}

	public boolean isHeisserTag() {
		return (max >= 30 && max < 35);
	}

	public boolean isSommerTag() {
		return (max >= 25 && max < 30);
	}

	public boolean isEisTag() {
		return (max < 0);
	}

	//
	// getters
	//
	public double[] getTemperaturen() {
		return temperaturen;
	}

	public double getMin() {
		return min;
	}

	public double getMax() {
		return max;
	}

	public double getMittelWert() {
		return mittelWert;
	}

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
