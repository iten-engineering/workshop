package chapter12.array;

import java.util.Arrays;

public class ArraySearch {

	public static void main(String[] args) {
		int[] numbers = { 0, 10, 12, 4, 7, 21, 20, 13};
		int searchNumber = 21;
		
		
		System.out.println("Array search: " + Arrays.toString(numbers));
		for (int i = 0; i < numbers.length; i++) {
			int currentNumber = numbers[i];
			
			if (searchNumber == currentNumber) {
				System.out.println("Number   = " + currentNumber);
				System.out.println("Position = " + i);
				break;
			}
		}
		

	}

}
