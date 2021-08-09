package chapter05.ctrl;

public class Modulo {

	public static void main(String[] args) {

		System.out.println("Ungerade Zahlen von 1-30:");
		for (int i = 1; i <= 30; i++) {
			int rest = i % 2;
			if (rest != 0) {
				System.out.println(i);
			}
		}
	}

}
