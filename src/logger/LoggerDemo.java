package logger;

public class LoggerDemo {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.create();

		logger.info("Hello");
		logger.warning("Hello");
		logger.error("Hello");

	}

}
