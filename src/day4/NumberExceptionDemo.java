package day4;

public class NumberExceptionDemo {

	public static void main(String[] args) {

		String[] lottoNumbers = { "-1", "0", "1", "17", "45", "46", "99" };

		for (String lottoNumber : lottoNumbers) {
			try {
				int number = parseLottoNumber(lottoNumber);
				System.out.println("Die Nummer " + number + " ist g�ltig.");
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}

	/**
	 * Die Methode liest eine Lotto Nummer als String ein und konvertiert diese
	 * in einen int Wert. Dabei pr�ft Sie ob die Nummer im g�ltigen Bereich von
	 * 1..45 ist.
	 * 
	 * @param lottoNumber
	 *            Die Lotto Nummer als String.
	 * @return Die konvertierte Nummer.
	 * @throws NumberException
	 *             Falls die Lotto Nummer ein ung�ltiges Format hat oder nicht
	 *             im g�ltigen Bereich liegt.
	 */
	public static int parseLottoNumber(String lottoNumber)
			throws NumberException {

		int number;

		try {
			number = Integer.parseInt(lottoNumber);
		} catch (NumberFormatException e) {
			throw new NumberException("Die Nummer hat ein ung�ltiges Format!");
		}

		if (number < 1) {
			throw new NumberException("Die Nummer " + number + " ist zu klein!");
		}

		if (number > 45) {
			throw new NumberException("Die Nummer " + number + " ist zu gross!");
		}

		return number;
	}
}
