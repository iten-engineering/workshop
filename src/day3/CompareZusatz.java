package day3;

public class CompareZusatz {

	public static void main(String[] args) {

		String s1 = "Abderhalden";
		String s2 = "Müller";

		if (s1.compareTo(s2) < 0) {

			System.out.println(s1.toLowerCase());
			System.out.println(s2.toLowerCase());

		} else {

			System.out.println(s2.toLowerCase());
			System.out.println(s1.toLowerCase());

		}

	}

}
