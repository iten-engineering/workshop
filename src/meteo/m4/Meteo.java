package meteo.m4;

public class Meteo implements Kenntage, Temperaturen {

	private TagesTemperaturen tagesTemperaturen;

	public Meteo(double[] temperaturen) {
		this.tagesTemperaturen = new TagesTemperaturen(temperaturen);
	}

	//
	// interface Temperaturen
	//
	@Override
	public double[] getTemperaturen() {
		return this.tagesTemperaturen.getTemperaturen();
	}

	@Override
	public double getMin() {
		return this.tagesTemperaturen.getMin();
	}

	@Override
	public double getMax() {
		return this.tagesTemperaturen.getMax();
	}

	@Override
	public double getMittelWert() {
		return this.tagesTemperaturen.getMittelWert();
	}

	//
	// interface Kenntage
	//
	@Override
	public boolean isTropenNacht() {
		return (getMin() >= 20);
	}

	@Override
	public boolean isVegetationsTag() {
		return (getMin() >= 5 && getMin() < 20);
	}

	@Override
	public boolean isFrostTag() {
		return (getMin() < 0);
	}

	@Override
	public boolean isHeizTag() {
		return (getMittelWert() < 12);
	}

	@Override
	public boolean isWuestenTag() {
		return (getMax() >= 35);
	}

	@Override
	public boolean isHeisserTag() {
		return (getMax() >= 30 && getMax() < 35);
	}

	@Override
	public boolean isSommerTag() {
		return (getMax() >= 25 && getMax() < 30);
	}

	@Override
	public boolean isEisTag() {
		return (getMax() < 0);
	}

}
