package day1;

public class MathUtil {

	private MathUtil() {
		super();
	}

	public static int min(int a, int b, int c) {
		if (a < b && a < c) {
			return a;
		} else if (b < c) {
			return b;
		} else {
			return c;
		}
	}

	public static int max(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	}

}
