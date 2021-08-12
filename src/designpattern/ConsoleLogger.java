package designpattern;

public class ConsoleLogger implements MyLogger {

	@Override
	public void debug(String message) {
		System.out.println("DEBUG: " + message);		
	}

	@Override
	public void warn(String message) {
		System.out.println("WARN: " + message);		
	}

	@Override
	public void error(String message) {
		System.out.println("ERROR: " + message);		
	}

}
