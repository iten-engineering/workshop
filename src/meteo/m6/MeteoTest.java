package meteo.m6;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MeteoTest {

	private static final double TOLERANCE = 0.001;
	private static final double[] TEMPARATUREN = { -8.1, -4.5, -2.1, -1.3, -0.1, -2.2, -4.1, -6.3 };
	private Meteo meteo = new Meteo(TEMPARATUREN);

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

}
