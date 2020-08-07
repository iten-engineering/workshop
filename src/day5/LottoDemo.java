package day5;

public class LottoDemo {

	public static void main(String[] args) {

		Lotto lotto = new Lotto();

		int[] numbers = lotto.draw();

		System.out.println("Draw:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
