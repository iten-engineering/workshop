package chapter10.interfacedemo;

public class MediaDemo {

	public static void main(String[] args) {

		Media m1 = new Audio();
		System.out.println("Audio:");
		m1.display();
		m1.play();
		m1.stop();

		Media m2 = new Video();
		System.out.println("\nVideo:");
		m2.display();
		m2.play();
		m2.stop();
	}

}
