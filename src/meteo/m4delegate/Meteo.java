package meteo.m4delegate;

public class Meteo implements Temperaturen, Kenntage {

	private TagesTemperaturen tagesTemperaturen;
	
	public Meteo(double[] temperaturen) {
		this.tagesTemperaturen = new TagesTemperaturen(temperaturen);
	}

	// ------------------------------------------------------------------------
	// Interface Temperaturen
	// ------------------------------------------------------------------------
	
	@Override
	public double[] getTemperaturen() {
		return this.tagesTemperaturen.getTemperaturen();
	}
	
	
	@Override
	public double getMin() {
		return min();
	}

	@Override
	public double getMax() {
		return max();
	}

	@Override
	public double getMittelWert() {
		return this.tagesTemperaturen.getMittelWert();
	}
	
	private double min() {
		return this.tagesTemperaturen.getMin();
	}

	private double max() {
		return this.tagesTemperaturen.getMax();
	}
	
	// ------------------------------------------------------------------------
	// Interface Kenntage
	// ------------------------------------------------------------------------
	
	
	//	Maxima:
	//	Tmax >= 35 ºC: Wüstentag
	//	Tmax >= 30 ºC: Heisser Tag
	//	Tmax >= 25 ºC: Sommertag
	//	Tmax < 0 ºC: Eistag

	@Override
	public boolean isWuestenTag() {
		if (max() >= 35) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean isHeisserTag() {
		if (max() >=30 && max() <35) {
			return true;
		}		
		return false;
	}
	
	@Override
	public boolean isSommerTag() {
		if (max() >=25 && max() <30) {
			return true;
		}		
		return false;
	}
	
	@Override
	public boolean isEisTag() {
		if (max() < 0) {
			return true;
		}
		return false;
	}
	
	// Minima:
	// Tmin >= 20 ºC: Tropennacht
	// Tmin >= 5 ºC: Vegetationstag
	// Tmin < 0 ºC: Frosttag

	@Override
	public boolean isTropenNacht() {
		if (min() >= 20) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isVegetationsTag() {
		if (min() >=5 && min() <20) {
			return true;
		}		
		return false;
	}

	@Override
	public boolean isFrostTag() {
		if (min() <0) {
			return true;
		}
		return false;
	}

	// Mittelwert:
	// Tmed < 12 ºC: Heiztag			
	@Override
	public boolean isHeizTag() {
		if (this.tagesTemperaturen.getMittelWert() < 12) {
			return true;
		}
		return false;
	}
	
}
