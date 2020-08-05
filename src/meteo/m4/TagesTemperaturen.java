package meteo.m4;

public class TagesTemperaturen implements Temperaturen {

	private double[] temperaturen;
	private double min;
	private double max;
	private double mittelWert;

	public TagesTemperaturen(double[] temperaturen) {
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
