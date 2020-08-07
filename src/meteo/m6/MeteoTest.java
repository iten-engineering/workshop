package meteo.m6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MeteoTest {

	private static final double TOLERANCE = 0.001;
	private static final double[] TEMPARATUREN = { -8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, -6.3 };
	private static final String FILENAME = "testdata.txt";
	private static List<MeteoTestData> testDataList = new ArrayList<MeteoTestData>();

	private Meteo meteo = new Meteo(TEMPARATUREN);

	@BeforeClass
	public static void loadTestData() throws Exception {

		try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME));) {

			String record = reader.readLine();
			boolean skip = true;

			while (record != null) {
				if (skip) {
					skip = false;
				} else {
					testDataList.add(new MeteoTestData(record));
				}

				record = reader.readLine();
			}

		} catch (Exception e) {
			System.out.println("loadTestData failed with: " + e.toString());
			throw e;
		}

	}

	@Test
	public void testTemparaturen() {
		Assert.assertEquals(-8.1, meteo.getMin(), TOLERANCE);
		Assert.assertEquals(-3.5875, meteo.getMittelWert(), TOLERANCE);
		Assert.assertEquals(-0.1, meteo.getMax(), TOLERANCE);
	}

	@Test
	public void testKenntage() {
		Assert.assertFalse(meteo.isTropenNacht());
		Assert.assertFalse(meteo.isVegetationsTag());
		Assert.assertTrue(meteo.isFrostTag());
		Assert.assertTrue(meteo.isHeizTag());
		Assert.assertFalse(meteo.isWuestenTag());
		Assert.assertFalse(meteo.isHeisserTag());
		Assert.assertFalse(meteo.isSommerTag());
		Assert.assertTrue(meteo.isEisTag());
	}

	@Test
	public void testKenntageEnum() {
		List<Kenntag> kenntage = meteo.getKenntage();

		Assert.assertNotNull(kenntage);
		Assert.assertEquals(3, kenntage.size());

		Assert.assertTrue(kenntage.contains(Kenntag.EIS_TAG));
		Assert.assertTrue(kenntage.contains(Kenntag.FROST_TAG));
		Assert.assertTrue(kenntage.contains(Kenntag.HEIZ_TAG));
	}

	@Test
	public void testTestData() {
		String testRecord = "-8.1, -3.5875, -0.1 : -8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, -6.3";

		MeteoTestData testData = new MeteoTestData(testRecord);

		Assert.assertEquals(-8.1, testData.getExpectedMin(), TOLERANCE);
		Assert.assertEquals(-3.5875, testData.getExpectedMed(), TOLERANCE);
		Assert.assertEquals(-0.1, testData.getExpectedMax(), TOLERANCE);

		Assert.assertEquals(8, testData.getTemperaturen().length);
		Assert.assertEquals(-8.1, testData.getTemperaturen()[0], TOLERANCE);
		Assert.assertEquals(-1.3, testData.getTemperaturen()[3], TOLERANCE);
		Assert.assertEquals(-6.3, testData.getTemperaturen()[7], TOLERANCE);
	}

	@Test
	public void testMeteoTestDataFromFile() {

		for (MeteoTestData testData : testDataList) {

			Meteo meteo = new Meteo(testData.getTemperaturen());

			Assert.assertEquals(testData.getExpectedMin(), meteo.getMin(), TOLERANCE);
			Assert.assertEquals(testData.getExpectedMed(), meteo.getMittelWert(), TOLERANCE);
			Assert.assertEquals(testData.getExpectedMax(), meteo.getMax(), TOLERANCE);
		}
	}

}
