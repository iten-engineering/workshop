package meteo.m3;

public class Meteo implements Kenntage, Temperaturen {

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

	//
	// interface Kenntage
	//
	@Override
	public boolean isTropenNacht() {
		return (min >= 20);
	}

	@Override
	public boolean isVegetationsTag() {
		return (min >= 5 && min < 20);
	}

	@Override
	public boolean isFrostTag() {
		return (min < 0);
	}

	@Override
	public boolean isHeizTag() {
		return (mittelWert < 12);
	}

	@Override
	public boolean isWuestenTag() {
		return (max >= 35);
	}

	@Override
	public boolean isHeisserTag() {
		return (max >= 30 && max < 35);
	}

	@Override
	public boolean isSommerTag() {
		return (max >= 25 && max < 30);
	}

	@Override
	public boolean isEisTag() {
		return (max < 0);
	}

	//
	// interface Temperaturen
	//
	@Override
	public double[] getTemperaturen() {
		return temperaturen;
	}

	@Override
	public double getMin() {
		return min;
	}

	@Override
	public double getMax() {
		return max;
	}

	@Override
	public double getMittelWert() {
		return mittelWert;
	}

}
