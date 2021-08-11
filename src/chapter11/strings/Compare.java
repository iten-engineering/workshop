package chapter11.strings;

public class Compare {

	public static void main(String[] args) {

		String s1 = "Abderhalden";
		String s2 = "M�ller";

		if (s1.compareTo(s2) < 0) {

			System.out.println(s1);
			System.out.println(s2);

		} else {

			System.out.println(s2);
			System.out.println(s1);

		}

	}

}
