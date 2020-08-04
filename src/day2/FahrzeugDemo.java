package day2;

public class FahrzeugDemo {

	public static void main(String[] args) {

		Fahrrad f = new Fahrrad("silber", 2011, "Scott");
		PKW p = new PKW("rot", 2007, 4);
		
		System.out.println(f.toString());
		System.out.println(p.toString());

		f.fahren();
		p.fahren();
		
	}

}

