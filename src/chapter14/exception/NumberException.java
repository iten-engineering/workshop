package chapter14.exception;

public class NumberException extends Exception {

	public NumberException() {
		super();
	}

	public NumberException(String message) {
		super(message);
	}

	public NumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NumberException(String message, Throwable cause) {
		super(message, cause);
	}


	public NumberException(Throwable cause) {
		super(cause);
	}

}
