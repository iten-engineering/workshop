package thread;

public class HelloRunnable implements Runnable {

	private Integer id;
	private Counter counter;
	int numberOfCounts;
	
	public HelloRunnable(Integer id, Counter counter, int numberOfCounts) {
		this.id = id;
		this.counter = counter;
		this.numberOfCounts = numberOfCounts;	
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < numberOfCounts; i++) {

			counter.inc();
			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
	
		}
				
	}

}
