package chapter11.strings;

public class SplitDate {

	public static void main(String[] args) {
		split("1.3.2007");
		split("01.03.2007");
		split("1.03.07");
	}
	
	public static void split(String text) {
		System.out.println("Datum: " + text);
		
		int idx1 = text.indexOf('.');
		int idx2 = text.indexOf('.', idx1+1);
		
		String day = text.substring(0, idx1);
		String month = text.substring(idx1+1, idx2);
		String year = text.substring(idx2+1);
		
		
		System.out.println("  day   = " + day);
		System.out.println("  month = " + month);
		System.out.println("  year  = " + year);		
	}

}
