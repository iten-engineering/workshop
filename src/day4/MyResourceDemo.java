package day4;

public class MyResourceDemo {

	public static void main(String[] args) {

		System.out.println("Test 1:");
		try (MyResource r = new MyResource()) {
			r.work();
		} catch (Exception e) {
			System.out.println("Error during work:" + e.getMessage());
		}

		System.out.println("\nTest 2:");
		try (MyResource r = new MyResource()) {
			r.workfailure();
		} catch (Exception e) {
			System.out.println("Error during workfailure:" + e.getMessage());
		}

	}

}
