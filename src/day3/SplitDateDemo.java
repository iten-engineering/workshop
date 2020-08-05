package day3;

public class SplitDateDemo {

	public static void main(String[] args) {
		split("17.04.1966");
		split("1.3.2007");
		split("1.3.07");

	}

	public static void split(String date) {

		System.out.println("Split: " + date);

		int idx1 = date.indexOf(".");
		int idx2 = date.indexOf(".", idx1 + 1);

		String day = date.substring(0, idx1);
		String month = date.substring(idx1 + 1, idx2);
		String year = date.substring(idx2 + 1);

		System.out.println(day + ":" + month + ":" + year);

	}

}
