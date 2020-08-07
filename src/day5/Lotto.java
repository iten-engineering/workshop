package day5;
import java.util.Random;

class Lotto {

	private static final int NR_RANGE_MAX = 45;

	private static final int NR_COUNT = 7;

	private int[] lotto;

	private int idx;

	public Lotto() {
		super();
	}

	public int[] draw() {
		Random random = new Random();
		int number;

		// init
		lotto = new int[NR_COUNT];
		idx = 0;

		// draw numbers
		while (idx < lotto.length) {
			do {
				// number between 1 .. NR_RANGE_MAX
				number = random.nextInt(NR_RANGE_MAX) + 1;
			} while (exist(number));

			lotto[idx] = number;
			idx++;
		}

		// return result
		return lotto;
	}

	private boolean exist(int number) {

		for (int i = 0; i <= idx; i++) {
			if (lotto[i] == number) {
				return true;
			}
		}

		return false;
	}

}
