package day2.greeter;

public class PersonalGreeter implements Greeter {

	@Override
	public void sayHello() {
		System.out.println("Hello mate");
	}

	@Override
	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}

	public void dummy() {
		System.out.println("nothing");
	}

}
