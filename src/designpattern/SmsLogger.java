package designpattern;

public class SmsLogger implements MyLogger {

	private MyLogger delegateLogger;
	
	public SmsLogger(MyLogger delegateLogger) {
		this.delegateLogger = delegateLogger;
	}
	
	@Override
	public void debug(String message) {
		delegateLogger.debug(message);
	}

	@Override
	public void warn(String message) {
		delegateLogger.warn(message);
	}

	@Override
	public void error(String message) {
		delegateLogger.error(message);
		System.out.println("Send SMS with message: " + message);
	}

}
