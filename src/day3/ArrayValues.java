package day3;

public class ArrayValues {

	public static void main(String[] args) {

		int[] values = {1,2,3};
		
		System.out.println("Array Values:");
		for(int i=0; i<values.length; i++) {
			System.out.println("Element " + i + " = " + values[i]);
		}
		
		System.out.println("\nArray Values mit verdoppelten Werten:");
		for(int i=0; i<values.length; i++) {
			values[i] = 2 * values[i];
			System.out.println("Element " + i + " = " + values[i]);
		}
	}

}
