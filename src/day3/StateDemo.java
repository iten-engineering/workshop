
package day3;

public class StateDemo {

	public static void main(String[] args) {

		State state = State.OPEN;
		System.out.println(state.toString() + ":" + state.getDbValue());

		int dbValue = 20;
		state = State.valueOf(dbValue);
		System.out.println(state.toString() + ":" + state.getDbValue());

	}
}
