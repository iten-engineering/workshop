package thread;

public class HelloThread extends Thread {

	public void run() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("HelloThread");
		
		synchronized(this) {
			notify();			
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("HelloThread Again");
	}
	
}
