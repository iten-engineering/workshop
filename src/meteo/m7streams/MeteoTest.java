package meteo.m7streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MeteoTest {

	public static final double[] TEST_DATA = { -8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, -6.3 };
	public static final double TOLERANCE = 0.001;

	private static final String TESTDATA_FILE = 
			"C:\\dev\\iten-engineering\\workshop\\src\\meteo\\m7streams\\Temperaturen.txt";
	
	private static List<MeteoTestData> testDataList = new ArrayList<MeteoTestData>();

	
	@BeforeClass
	public static void init() {

		try (BufferedReader reader = new BufferedReader( new FileReader(TESTDATA_FILE) )) {

			boolean skippedHead = false;
			String record = reader.readLine();
			
			while (record != null) {
				if (! skippedHead) {
					skippedHead = true;
				} else {
					MeteoTest.testDataList.add( new MeteoTestData(record));
				}
				record = reader.readLine();	
			}
			
			
		} catch (Exception e) {
			System.out.println("Init failed with: " + e.toString());
		}
		
		
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

	@Test
	public void testTemperaturen() {
		Meteo meteo = new Meteo(TEST_DATA);

		Assert.assertEquals(-8.1, meteo.getMin(), TOLERANCE);
		Assert.assertEquals(-0.1, meteo.getMax(), TOLERANCE);
		Assert.assertEquals(-3.5875, meteo.getMittelWert(), TOLERANCE);
	}

	@Test
	public void testKenntage() {
		Meteo meteo = new Meteo(TEST_DATA);

		Assert.assertTrue(meteo.isEisTag());
		Assert.assertTrue(meteo.isFrostTag());
		Assert.assertFalse(meteo.isHeisserTag());
		Assert.assertTrue(meteo.isHeizTag());
		Assert.assertFalse(meteo.isSommerTag());
		Assert.assertFalse(meteo.isTropenNacht());
		Assert.assertFalse(meteo.isVegetationsTag());
		Assert.assertFalse(meteo.isWuestenTag());
	}

	@Test
	public void testKenntageEnum() {
		Meteo meteo = new Meteo(TEST_DATA);

		List<Kenntag> kenntage = meteo.getKenntage();

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

} // end
