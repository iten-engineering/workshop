package chapter10.interfacedemo;

public class GreeterDemo {

	public static void main(String[] args) {
		
		Greeter g = GreeterFactory.create();
		
		g.sayHello();
		g.sayHello("Zoé");
	}

}
