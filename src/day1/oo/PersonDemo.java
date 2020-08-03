package day1.oo;

public class PersonDemo {

	public static void main(String[] args) {

		Person p = new Person();
		p.setName("Greta");
		p.setJahrgang(2007);

		Person p2 = new Kunde("Pipi", 1966, 4711);

		System.out.println(p.toString());
		System.out.println(p2.toString());

	}

}
