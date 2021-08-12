package chapter14.exception;

import java.io.Closeable;
import java.io.IOException;

public class Worker implements Closeable {
	
	public Worker() {
		System.out.println("Allocate resource");
	}

	public void work() throws Exception {
		System.out.println("working...");
		throw new Exception("oops, something went wrong");
	}

	@Override
	public void close() throws IOException {
		System.out.println("Close resource");
		
	}
	
}
