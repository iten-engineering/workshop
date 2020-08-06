package day4;

import java.io.Closeable;
import java.io.IOException;

public class MyResource implements Closeable {

	public MyResource() {
		System.out.println("MyResource:create");
	}

	public void work() {
		System.out.println("MyResource:work");
	}

	public void workfailure() throws Exception {
		System.out.println("MyResource:workfailure");
		throw new Exception("refuse work");
	}

	@Override
	public void close() throws IOException {
		System.out.println("MyResource:close");

	}

}
