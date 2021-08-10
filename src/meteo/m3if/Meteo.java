package meteo.m3if;

public class Meteo implements Temperaturen, Kenntage {

	private double min;
	private double max;
	private double mittelWert;
	private double[] temperaturen;
	
	public Meteo(double[] temperaturen) {
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

	// ------------------------------------------------------------------------
	// Interface Temperaturen
	// ------------------------------------------------------------------------
	
	@Override
	public double[] getTemperaturen() {
		return this.temperaturen;
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
		if (this.max >= 35) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean isHeisserTag() {
		if (this.max >=30 && this.max <35) {
			return true;
		}		
		return false;
	}
	
	@Override
	public boolean isSommerTag() {
		if (this.max >=25 && this.max <30) {
			return true;
		}		
		return false;
	}
	
	@Override
	public boolean isEisTag() {
		if (this.max < 0) {
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
		if (this.min >= 20) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isVegetationsTag() {
		if (this.min >=5 && this.min <20) {
			return true;
		}		
		return false;
	}

	@Override
	public boolean isFrostTag() {
		if (this.min <0) {
			return true;
		}
		return false;
	}

	// Mittelwert:
	// Tmed < 12 ºC: Heiztag			
	@Override
	public boolean isHeizTag() {
		if (this.getMittelWert() < 12) {
			return true;
		}
		return false;
	}
	
}
