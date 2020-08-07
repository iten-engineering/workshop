package features.java09;

import java.util.ArrayList;
import java.util.List;

public class DeprecatedDemo {

	public static void main(String[] args) {
		System.out.println(before());
		System.out.println(now());
	}

	@Deprecated
	public static String before() {
		List<String> list = new ArrayList<String>();
		list.add("Before : @Deprecated");
		return list.toString();
	}

	@Deprecated(since = "4.2", forRemoval = true)
	public static String now() {
		List<String> list = new ArrayList<>();
		list.add("Now    : @Deprecated(since=\"4.2\", forRemoval=true)");
		return list.toString();
	}
}
