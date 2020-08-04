package day2.greeter;

public class GreeterDemo {

	public static void main(String[] args) {

		Greeter g = GreeterFactory.create();

		g.sayHello();
		g.sayHello("Greta");

	}

}
