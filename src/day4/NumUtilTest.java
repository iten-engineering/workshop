package day4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumUtilTest {

	private NumUtil numUtil = new NumUtilImpl();

	NumUtil util = new NumUtilImpl();

	@Test
	public void testMinNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			util.min(null);
		});
	}

	@Test
	public void testMinOutOfMinRange() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			util.min(1, 2, 3);
		});
	}

	@Test
	public void testMinOutOfMaxRange() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			util.min(2, 3, 13);
		});
	}

	@Test
	public void testMin() {
		assertEquals(Integer.valueOf(2), util.min(2, 3, 4, 6, 7, 8, 9, 10, 11, 12));
		assertEquals(Integer.valueOf(10), util.min(10, 11, 12));
		assertEquals(Integer.valueOf(3), util.min(3, 5, 7));
	}

	@Test
	public void testMaxNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			util.max(null);
		});
	}

	@Test
	public void testMaxOutOfMinRange() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			util.max(1, 2, 3);
		});
	}

	@Test
	public void testMaxOutOfMaxRange() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			util.max(2, 3, 13);
		});
	}

	@Test
	public void testMax() {
		assertEquals(Integer.valueOf(12), util.max(2, 3, 4, 6, 7, 8, 9, 10, 11, 12));
		assertEquals(Integer.valueOf(12), util.max(10, 11, 12));
		assertEquals(Integer.valueOf(7), util.max(3, 5, 7));
	}

	@Test
	public void testSumNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			util.sum(null);
		});
	}

	@Test
	public void testSumEmpty() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			util.sum(new ArrayList<Integer>());
		});
	}

	@Test
	public void testSumOutOfMinRange() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			util.sum(toList(0, 50, 100));
		});

	}

	@Test
	public void testSumOutOfMaxRange() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			util.sum(toList(1, 50, 101));
		});
	}

	@Test
	public void testSum() {
		assertEquals(Double.valueOf(6), util.sum(toList(1, 2, 3)));
		assertEquals(Double.valueOf(250), util.sum(toList(100, 100, 50)));
	}

	@Test
	public void testAvgNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			util.avg(null);
		});
	}

	@Test
	public void testAvgEmpty() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			util.avg(new ArrayList<Integer>());
		});

	}

	@Test
	public void testAvgOutOfMinRange() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			util.avg(toList(1, 2, 25));
		});

	}

	@Test
	public void testAvgOutOfMaxRange() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			util.avg(toList(2, 25, 26));
		});

	}

	@Test
	public void testAvg() {
		assertEquals(Double.valueOf(4), util.avg(toList(2, 4, 6)));
		assertEquals(Double.valueOf(15), util.avg(toList(10, 20)));
	}

	private List<Integer> toList(Integer... values) {
		List<Integer> list = new ArrayList<Integer>();

		for (Integer value : values) {
			list.add(value);
		}

		return list;
	}

}
