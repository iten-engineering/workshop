package designpattern;

import java.util.HashMap;
import java.util.Map;

public class PlzCache {
	
	private static PlzCache INSTANCE = new PlzCache();
	private Map<Integer, String> plzMap = new HashMap<>();
	
	private PlzCache() {
		plzMap.put(3000, "Bern");
		plzMap.put(3052, "Zollikofen");
		plzMap.put(2000, "Biel");		
	}
	
	public static PlzCache getInstance() {
		return INSTANCE;
	}
	
	public String getCity(Integer plz) {
		return this.plzMap.get(plz);
	}
	
}
