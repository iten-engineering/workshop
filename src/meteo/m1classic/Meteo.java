package meteo.m1classic;

public class Meteo {

	public static void main(String[] args) {
		double[] temperaturen = {-8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, -6.3};	
		double min = temperaturen[0];
		double max = temperaturen[0];
		double sum = 0;
		double avg = 0;
		
		for (double t : temperaturen) {		
			if (t < min) {
				min = t;
			}	
			if (t > max) {
				max = t;
			}
			sum = sum + t;
		}
		avg = sum / temperaturen.length;
		
		System.out.println("Temperaturen:");
		System.out.println("min = " + min);
		System.out.println("max = " + max);
		System.out.println("avg = " + avg);
		
		System.out.println("Kenntage:");
		if (max >= 35) {
			System.out.println("Wüstentag");
		} else if (max >=30) {
			System.out.println("Heisser Tag");			
		} else if (max >= 25) {
			System.out.println("Sommertag");
		} else if (max <0) {
			System.out.println("Eistag");
		}

		if (min >= 20) {
			System.out.println("Tropennacht");
		} else if (min >= 5) {
			System.out.println("Vegetationsnacht");
		} else if (min < 0) {
			System.out.println("Frosttag");
		}
		
		if (avg < 12) {
			System.out.println("Heiztag");
		}
	}

}
