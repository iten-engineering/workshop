package designpattern;

public class MyLoggerDemo {

	public static void main(String[] args) {
		
		MyLogger log = MyLoggerFactory.create();
		
		log.debug("Debug message");
		log.warn("Warning message");
		log.error("Error message");
	}

}
