package day2.greeter;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GreeterFactory {

	private GreeterFactory() {
		super();
	}

	public static Greeter create() {

		if (isWeekend()) {
			return new WeekendGreeter();
		}

		return new PersonalGreeter();
	}

	private static boolean isWeekend() {
		Calendar cal = new GregorianCalendar();
		int day = cal.get(Calendar.DAY_OF_WEEK);

		return (day == Calendar.SATURDAY || day == Calendar.SUNDAY);
	}

}
