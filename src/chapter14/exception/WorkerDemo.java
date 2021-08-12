package chapter14.exception;

public class WorkerDemo {

	public static void main(String[] args) {
		
		try (Worker w = new Worker()) {
			
			w.work();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
