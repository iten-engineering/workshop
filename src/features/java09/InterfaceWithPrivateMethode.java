package features.java09;

public interface InterfaceWithPrivateMethode {

	public abstract String greet(String name);

	public default String hello(String name) {
		return greeter("Hello", name);
	}

	public default String hi(String name) {
		return greeter("Hi", name);
	}

	// new: private methods in interfaces
	private String greeter(String greeting, String name) {
		return greeting + " " + name;
	}
}
