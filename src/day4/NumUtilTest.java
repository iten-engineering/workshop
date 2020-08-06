package day4;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumUtilTest {

	private NumUtil numUtil = new NumUtilImpl();

	@Test
	public void min() {

		int actual = numUtil.min(5, 6, 7);
		Assert.assertEquals(5, actual);

	}

	@Test
	public void minInvalidRange() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			numUtil.min(0, 5, 6, 7);
		});

	}

}
