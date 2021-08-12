package chapter14.exception;

public class NumberExceptionDemo {

	public static void main(String[] args) {

		String[] numbers = { "-1", "0", "1", "5", "12", "44", "45", "46", "100x" };

		for (String number : numbers) {

			try {
				int i = parse(number);
				System.out.println("Die Nummer ist gültig: " + i);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}

	public static int parse(String lottoNumber) throws NumberException {

		int number;

		try {

			number = Integer.parseInt(lottoNumber);

		} catch (Exception e) {
			String msg = "Ungültiges Format: " + lottoNumber;
			throw new NumberException(msg, e);
		}

		if (number < 1) {
			String msg = "Die Nummer " + lottoNumber + " ist zu klein.";
			throw new NumberException(msg);
		}

		if (number > 45) {
			String msg = "Die Nummer " + lottoNumber + " ist zu gross.";
			throw new NumberException(msg);
		}

		return number;

	}

}
