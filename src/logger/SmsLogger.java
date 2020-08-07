package logger;

public class SmsLogger implements Logger {

	private Logger delegateTo;

	public SmsLogger(Logger delegateTo) {
		this.delegateTo = delegateTo;
	}

	@Override
	public void info(String message) {
		delegateTo.info(message);

	}

	@Override
	public void error(String message) {
		delegateTo.error(message);
		System.out.println("ERROR:Send SMS");
	}

	@Override
	public void warning(String message) {
		delegateTo.warning(message);
	}

}
