package features.java09;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class ProcessIdDemo {

	public static void main(String[] args) {
		System.out.println(before());
		System.out.println(now());
	}

	public static long before() {
		RuntimeMXBean rt = ManagementFactory.getRuntimeMXBean();
		long pid = Integer.parseInt(rt.getName().substring(0, rt.getName().indexOf("@")));

		return pid;
	}

	/**
	 * Java 9 Process API:
	 * https://docs.oracle.com/javase/9/docs/api/java/lang/ProcessHandle.html
	 */
	public static long now() {
		return ProcessHandle.current().pid();
	}

}
