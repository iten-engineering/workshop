package meteo.m6;

public class MeteoTestData {

	private static final String SECTION_DELIMITER = ":";
	private static final String RECORD_DELIMITER = ",";

	private double expectedMin;
	private double expectedMed;
	private double expectedMax;
	private double[] temperaturen;

	public MeteoTestData(String testRecord) {

		// Sample data
		// "-8.1, -3.5875, -0.1 : -8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, -6.3";
		int sectionIndex = testRecord.indexOf(SECTION_DELIMITER);

		// expected values
		String section = testRecord.substring(0, sectionIndex);
		String[] tokens = section.split(RECORD_DELIMITER);

		expectedMin = Double.valueOf(tokens[0]);
		expectedMed = Double.valueOf(tokens[1]);
		expectedMax = Double.valueOf(tokens[2]);

		// temperaturen
		section = testRecord.substring(sectionIndex + 1);
		tokens = section.split(RECORD_DELIMITER);

		temperaturen = new double[tokens.length];
		for (int i = 0; i < tokens.length; i++) {
			temperaturen[i] = Double.valueOf(tokens[i].trim());
		}

	}

	public double getExpectedMin() {
		return expectedMin;
	}

	public double getExpectedMed() {
		return expectedMed;
	}

	public double getExpectedMax() {
		return expectedMax;
	}

	public double[] getTemperaturen() {
		return temperaturen;
	}

}
