package day3;
public class ArraySearch {

	public static void main(String[] args) {

		int[] numbers = { 0, 10, 12, 4, 7, 21, 20, 13 };
		int nr = 21;

		System.out.print("Array Search: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			System.out.print(" ");
		}
		System.out.println();
		
		System.out.println("  Nr = " + nr);
		
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == nr) {
				System.out.println("  Position = " + i);
				break;
			}
		}

	}

}
