package features.java11;

import java.util.function.IntFunction;

public class VarLambdaDemo {

	public static void main(String[] args) {

		IntFunction<Integer> triple = (var x) -> x * 3;
		System.out.println(triple.apply(2));
	}

}
