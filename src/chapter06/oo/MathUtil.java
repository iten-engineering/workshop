package chapter06.oo;

public class MathUtil {

	private MathUtil() {
		super();
	}
	
	public static int min(int a, int b, int c) {
	
		if (a < b && a < c) {
			return a;
		}
		
		if (b < c) {
			return b;
		}
		
		return c;
	}
	
	public static int max(int a, int b, int c) {
		
		if (a > b && a > c) {
			return a;
		}
		
		if (b > c) {
			return b;
		}
		
		return c;
	}
	
}
