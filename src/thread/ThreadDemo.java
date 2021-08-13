package thread;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {

		HelloThread helloThread = new HelloThread();

		System.out.println("Main Start");
		helloThread.start();
		
		synchronized (helloThread) {
			helloThread.wait();
		}

		System.out.println("Main End");

	}
}
