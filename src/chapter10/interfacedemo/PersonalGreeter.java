package chapter10.interfacedemo;

public class PersonalGreeter implements Greeter {

	@Override
	public void sayHello() {
		System.out.println("Hello mate");
	}

	@Override
	public void sayHello(String name) {
		System.out.println("Hello " + name);
		
	}
	
	public void sayAbc() {
		System.out.println("ABC");
	}

}
