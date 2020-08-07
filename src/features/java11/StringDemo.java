package features.java11;

import java.util.ArrayList;
import java.util.List;

public class StringDemo {

	public static void main(String[] args) {

		System.out.println("repeat:");
		String str = "7".repeat(7);
		System.out.println(str);
		System.out.println();

		System.out.println("isBlank:");
		System.out.println("\"1\".isBlank() : " + "1".isBlank());
		System.out.println("\"\".isBlank()  : " + "".isBlank());
		System.out.println("\"  \".isBlank(): " + "  ".isBlank());
		System.out.println();

		System.out.println("strip:");
		System.out.println("\"   hi  \".strip()        : <" + "   hi  ".strip() + ">");
		System.out.println("\"   hi  \".stripLeading() : <" + "   hi  ".stripLeading() + ">");
		System.out.println("\"   hi  \".stripTrailing(): <" + "   hi  ".stripTrailing() + ">");
		System.out.println();

		System.out.println("lines:");
		String testString = "hello\nworld\nis\nexecuted";
		List<String> lines = new ArrayList<>();
		testString.lines().forEach(line -> lines.add(line));
		System.out.println(lines);
		System.out.println();

	}

}
