package day2;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("Peter", "Müller");
		Person p2 = new Person("Anita", "Sutter");
		Person p3 = new Person("Andrea", "Frey");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

	}	
	
}
