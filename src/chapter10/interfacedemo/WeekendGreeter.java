package chapter10.interfacedemo;

public class WeekendGreeter implements Greeter {

	@Override
	public void sayHello() {
		System.out.println("Hello mate, have a nice weekend");		
	}

	@Override
	public void sayHello(String name) {
		System.out.println("Hello " + name + ", have a nice weekend");
	}

}
