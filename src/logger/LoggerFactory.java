package logger;

public class LoggerFactory {

	public static Logger create() {
		return new SmsLogger(new ConsoleLogger());
	}
}
