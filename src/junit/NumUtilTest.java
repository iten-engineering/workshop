package junit;

import org.junit.Test;

import org.junit.*;

public class NumUtilTest {
	
	NumUtil numUtil = new NumUtilImpl();

	
	@Test(expected = IllegalArgumentException.class)
	public void minToSmall() {
		numUtil.min(1,2,3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void minToLarge() {
		System.out.println( numUtil.min(11,12,13) );
	}
	
	@Test
	public void minAll() {
		int expected = 2;
		int actual = numUtil.min(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void minRange() {
		int expected = 3;
		int actual = numUtil.min(12, 7, 3, 9, 11);
		Assert.assertEquals(expected, actual);
	}
	
}
