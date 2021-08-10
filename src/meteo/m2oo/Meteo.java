package meteo.m2oo;

public class Meteo {

	private double min;
	private double max;
	private double mittelWert;
	
	public Meteo(double[] temperaturen) {
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

	public double getMin() {
		return min;
	}

	public double getMax() {
		return max;
	}

	public double getMittelWert() {
		return mittelWert;
	}
	
	//	Maxima:
	//	Tmax >= 35 ºC: Wüstentag
	//	Tmax >= 30 ºC: Heisser Tag
	//	Tmax >= 25 ºC: Sommertag
	//	Tmax < 0 ºC: Eistag
	public boolean isWuestenTag() {
		if (this.max >= 35) {
			return true;
		}
		return false;
	}
	
	public boolean isHeisserTag() {
		if (this.max >=30 && this.max <35) {
			return true;
		}		
		return false;
	}
	
	public boolean isSommerTag() {
		if (this.max >=25 && this.max <30) {
			return true;
		}		
		return false;
	}
	
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
	public boolean isTropenNacht() {
		if (this.min >= 20) {
			return true;
		}
		return false;
	}
	public boolean isVegetationsTag() {
		if (this.min >=5 && this.min <20) {
			return true;
		}		
		return false;
	}
	public boolean isFrostTag() {
		if (this.min <0) {
			return true;
		}
		return false;
	}

	// Mittelwert:
	// Tmed < 12 ºC: Heiztag		
	public boolean isHeizTag() {
		if (this.getMittelWert() < 12) {
			return true;
		}
		return false;
	}
	
}
