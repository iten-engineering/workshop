package meteo.m7streams;

import java.util.Arrays;

public class MeteoTestData {
	
	public static final String SECTION_DELIMITER = ":";
	public static final String RECORD_DELIMITER = ",";
	
	private double expectedMin;
	private double expectedMax;
	private double expectedMed;
	private double[] temperaturen;
	

	public MeteoTestData(String testRecord) {
		
		// MIN  MED  MAX : TEMPERATUREN
		// -8.1, -3.5875, -0.1 : -8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, -6.3
		int sectionIdx = testRecord.indexOf(SECTION_DELIMITER);
		
		String expectedSection = testRecord.substring(0, sectionIdx).trim();
		String tempSection = testRecord.substring(sectionIdx+1).trim();
		
		// expected values
		String[] tokens = expectedSection.split(RECORD_DELIMITER);
		
		this.expectedMin = Double.valueOf( tokens[0].trim() );
		this.expectedMed = Double.valueOf( tokens[1].trim() );
		this.expectedMax = Double.valueOf( tokens[2].trim() );
		
		// temperatures
		tokens = tempSection.split(RECORD_DELIMITER);
		
		this.temperaturen = new double[tokens.length];		
		for (int i = 0; i < tokens.length; i++) {
			this.temperaturen[i] = Double.valueOf( tokens[i].trim() );
		}		
	}


	public double getExpectedMin() {
		return expectedMin;
	}


	public void setExpectedMin(double expectedMin) {
		this.expectedMin = expectedMin;
	}


	public double getExpectedMax() {
		return expectedMax;
	}


	public void setExpectedMax(double expectedMax) {
		this.expectedMax = expectedMax;
	}


	public double getExpectedMed() {
		return expectedMed;
	}


	public void setExpectedMed(double expectedMed) {
		this.expectedMed = expectedMed;
	}


	public double[] getTemperaturen() {
		return temperaturen;
	}


	public void setTemperaturen(double[] temperaturen) {
		this.temperaturen = temperaturen;
	}
	
}
