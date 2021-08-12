package designpattern;

public class MyLoggerFactory {
	
	public static MyLogger create() {
		
		return new SmsLogger( new ConsoleLogger() );
		
	}

}
