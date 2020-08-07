package features.java12;

import static java.time.DayOfWeek.FRIDAY;

import java.time.DayOfWeek;

public class SwitchExpressionPreview {

	public static void main(String[] args) {

		DayOfWeek day = FRIDAY;

		boolean isWeekend = switch (day) {
		case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> false;
		case SATURDAY, SUNDAY -> true;
		default -> throw new IllegalStateException("Illegal day entry :: " + day);
		};

		System.out.println(isWeekend); // true or false - based on current day

	}

}
