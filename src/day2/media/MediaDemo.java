package day2.media;

public class MediaDemo {

	public static void main(String[] args) {
		Media[] medias = { new Audio(), new Video() };

		for (Media m : medias) {
			m.display();
			m.play();
			m.stop();
			System.out.println();
		}

	}

}
