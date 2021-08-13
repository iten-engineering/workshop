package meteo.m6unittest;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;



public class MeteoTest {

	public static final double[] TEST_DATA = { -8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, -6.3 };
	public static final double TOLERANCE = 0.001;
	
	
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
		Assert.assertTrue( kenntage.contains(Kenntag.EIS_TAG));
		Assert.assertTrue( kenntage.contains(Kenntag.FROST_TAG));
		Assert.assertTrue( kenntage.contains(Kenntag.HEIZ_TAG));
	}	
	
	
} // end
