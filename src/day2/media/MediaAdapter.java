package day2.media;

public abstract class MediaAdapter implements Media {

	@Override
	public void stop() {
		System.out.println("stop MediaAdapter");

	}

	@Override
	public void display() {
		System.out.println("display MediaAdapter");
	}

}
