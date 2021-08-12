package designpattern;

public class PlzDemo {

	public static void main(String[] args) {
		PlzCache plz = PlzCache.getInstance();

		System.out.println(plz.getCity(3000));

	}

}
