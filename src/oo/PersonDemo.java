package oo;

import java.util.ArrayList;
import java.util.List;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person pipi = new Person("Pipi", 1966);
		pipi.setName("Pipi Langstrumpf");		
		Person max = new Mitarbeiter("Max", 1990, 80000);	
		
		Person livia = new Kunde("Livia", 1990, 1234);
		
		if (livia instanceof Kunde) {
			Kunde k = (Kunde) livia;
			System.out.println( k.toString() );			
		}	
		
//		List<Person> persons = new ArrayList<>();
//		persons.add(pipi);
//		persons.add(max);
//		persons.add(livia);
//		persons.add(new Kunde("Angela", 1950, 250000));
//		
//		for (Person person : persons) {
//			System.out.println(person.toString());
//		}
	}

}
