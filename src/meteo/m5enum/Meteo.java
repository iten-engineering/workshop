package meteo.m5enum;

import java.util.ArrayList;
import java.util.List;

public class Meteo implements Temperaturen, Kenntage {

	private TagesTemperaturen tagesTemperaturen;

	public Meteo(double[] temperaturen) {
		this.tagesTemperaturen = new TagesTemperaturen(temperaturen);
	}

	// ------------------------------------------------------------------------
	// interface Temperaturen
	// ------------------------------------------------------------------------

	@Override
	public double[] getTemperaturen() {
		return tagesTemperaturen.getTemperaturen();
	}

	@Override
	public double getMittelWert() {
		return tagesTemperaturen.getMittelWert();
	}

	@Override
	public double getMin() {
		return tagesTemperaturen.getMin();
	}

	@Override
	public double getMax() {
		return tagesTemperaturen.getMax();
	}

	// ------------------------------------------------------------------------
	// interface Kenntage
	// ------------------------------------------------------------------------

	// Tmin > = 20 Grad Celsius: Tropennacht
	// Tmin > = 5 Grad Celsius: Vegetationstag
	// Tmin < 0 Grad Celsius: Frosttag
	@Override
	public boolean isTropenNacht() {
		return (tagesTemperaturen.getMin() >= 20);
	}

	@Override
	public boolean isVegetationsTag() {
		return (tagesTemperaturen.getMin() >= 5 && tagesTemperaturen.getMin() < 20);
	}

	@Override
	public boolean isFrostTag() {
		return (tagesTemperaturen.getMin() < 0);
	}

	// Tmed < 12 Grad: Celcius Heiztag
	@Override
	public boolean isHeizTag() {
		return (tagesTemperaturen.getMittelWert() < 12);
	}

	// Tmax > = 35 Grad Celsius: Wüstentag
	// Tmax > = 30 Grad Celsius: Heisser Tag
	// Tmax > = 25 Grad Celsius: Sommertag
	// Tmax < 0 Grad Celsius: Eistag
	@Override
	public boolean isWuestenTag() {
		return (tagesTemperaturen.getMax() >= 35);
	}

	@Override
	public boolean isHeisserTag() {
		return (tagesTemperaturen.getMax() >= 30 && tagesTemperaturen.getMax() < 35);
	}

	@Override
	public boolean isSommerTag() {
		return (tagesTemperaturen.getMax() >= 25 && tagesTemperaturen.getMax() < 30);
	}

	@Override
	public boolean isEisTag() {
		return (tagesTemperaturen.getMax() < 0);
	}

	@Override
	public List<Kenntag> getKenntage() {

		List<Kenntag> result = new ArrayList<Kenntag>();

		if (isTropenNacht()) {
			result.add(Kenntag.TROPEN_NACHT);
		}

		if (isVegetationsTag()) {
			result.add(Kenntag.VEGETATIONS_TAG);
		}

		if (isFrostTag()) {
			result.add(Kenntag.FROST_TAG);
		}

		if (isHeizTag()) {
			result.add(Kenntag.HEIZ_TAG);
		}

		if (isWuestenTag()) {
			result.add(Kenntag.WUESTEN_TAG);
		}

		if (isHeisserTag()) {
			result.add(Kenntag.HEISSER_TAG);
		}

		if (isSommerTag()) {
			result.add(Kenntag.SOMMER_TAG);
		}

		if (isEisTag()) {
			result.add(Kenntag.EIS_TAG);
		}

		return result;
	}

} // end
