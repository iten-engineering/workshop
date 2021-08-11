package meteo.m4delegate;

public class TagesTemperaturen implements Temperaturen {

	private double min;
	private double max;
	private double mittelWert;
	private double[] temperaturen;

	public TagesTemperaturen(double[] temperaturen) {
		this.temperaturen = temperaturen;
		this.min = temperaturen[0];
		this.max = temperaturen[0];
		double sum = 0;
		
		for (double t : temperaturen) {		
			if (t < this.min) {
				this.min = t;
			}	
			if (t > this.max) {
				this.max = t;
			}
			sum = sum + t;
		}
		this.mittelWert = sum / temperaturen.length;		
	}
	
	
	@Override
	public double[] getTemperaturen() {
		return this.temperaturen;
	}

	@Override
	public double getMittelWert() {
		return this.mittelWert;
	}

	@Override
	public double getMin() {
		return this.min;
	}

	@Override
	public double getMax() {
		return this.max;
	}

}
