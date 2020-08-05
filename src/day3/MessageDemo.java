package day3;

public class MessageDemo {

	public static void show(Message type, String message) {
		
		switch (type) {
		case INFO:
			System.out.println("Information:");
			break;
		case WARN:
			System.out.println("Warnung:");			
			break;
		case ERROR:
			System.out.println("Fehler:");
			break;
		}
		
		System.out.println(message);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		show(Message.INFO, "Die Bestellung wurde erfolgreich abgeschlossen.");
		show(Message.WARN, "Die Bestellung ist noch nicht vollständig.");
		show(Message.ERROR, "Die Bestellung wurde wegen einem technischen Defekt abgebrochen.");
	}
	
	
}
