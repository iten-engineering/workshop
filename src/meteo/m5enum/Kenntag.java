package meteo.m5enum;

public enum Kenntag {

    TROPEN_NACHT("Tropennacht"), 
    VEGETATIONS_TAG("Vegetationstag"), 
    FROST_TAG("Frosttag"), 
    HEIZ_TAG("Heiztag"), 
    WUESTEN_TAG("Wüstentag"), 
    HEISSER_TAG("Heisser Tag"), 
    SOMMER_TAG("Sommertag"), 
    EIS_TAG("Eistag");
	
	private String name;
	
	Kenntag(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

} // end
