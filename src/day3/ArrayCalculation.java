package day3;

public class ArrayCalculation {

	public static void main(String[] args) {

		int[] values = new int[6];

		values[0] = 20;
		values[1] = 37;
		values[2] = 5;
		values[3] = 7;
		values[4] = 11;
		values[5] = 13;

		int summe = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		System.out.println("ArrayCalculation:");
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
			summe = summe + values[i];

			if (values[i] > max) {
				max = values[i];
			}

			if (values[i] < min) {
				min = values[i];
			}
		}

		System.out.println("Summe        = " + summe);
		System.out.println("Durchschnitt = " + summe / values.length);
		System.out.println("Minimum      = " + min);
		System.out.println("Maximum      = " + max);
	}

}
