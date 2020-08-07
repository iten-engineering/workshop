package features.java09;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperatorDemo {

	public static void main(String[] args) {
		System.out.println(before());
		System.out.println(now());
	}

	public static String before() {
		List<String> list = new ArrayList<String>();
		list.add("Before : List<String> list = new ArrayList<String>();");
		return list.toString();
	}

	public static String now() {
		List<String> list = new ArrayList<>();
		list.add("Now    : List<String> list = new ArrayList<>();");
		return list.toString();
	}
}
