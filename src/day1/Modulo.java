package day1;

public class Modulo {

	public static void main(String[] args) {

		for (int i = 1; i <= 30; i++) {

			int rest = i % 2;

			if (rest > 0) {
				System.out.println(i);
			}
		}

	}

}
