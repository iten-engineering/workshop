package day1;

public class MathUtilDemo {

	public static void main(String[] args) {
		System.out.println("Das Maximum von 5, 12, 20 ist: " + MathUtil.max(5, 12, 20) );
		System.out.println("Das Maximum von 49, 3,  4 ist: " + MathUtil.max(49, 3, 4) );
		System.out.println("Das Maximum von  5, 60, 1 ist: " + MathUtil.max(5, 60, 1) );
		System.out.println();
		System.out.println("Das Minimum von 5, 12, 20 ist: " + MathUtil.min(5, 12, 20) );
		System.out.println("Das Minimum von 49, 3,  4 ist: " + MathUtil.min(49, 3, 4) );
		System.out.println("Das Minimum von  5, 60, 1 ist: " + MathUtil.min(5, 60, 1) );
	}
}
