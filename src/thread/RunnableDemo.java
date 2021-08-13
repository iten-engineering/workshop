package thread;

import java.util.ArrayList;
import java.util.List;

public class RunnableDemo {

	public static void main(String[] args) throws Exception {

		Counter counter = new Counter();
		List<Thread> threads = new ArrayList<>();
		
		int numberOfTreads = 100000;
		int numberOfCounts = 100;
		
		System.out.println("Main Start");
		for (int i = 0; i < numberOfTreads; i++) {
			Thread t = new Thread (new HelloRunnable(i, counter, numberOfCounts));
			t.start();	
			threads.add(t);
		}
		
		for (Thread thread : threads) {
			thread.join();
		}
		
		System.out.println("Main End");
		System.out.println("Counts = " + counter.getCount());
		
	}

}
