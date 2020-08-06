package day4;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SquareNumbers {

	public static final String FILE_NAME = "src/chapter16/files/nio/solution/SquareNumbers.txt";

	public static void main(String[] args) {

		//
		// Initialisierung
		//
		Path file = Paths.get(FILE_NAME);

		try {
			// Datei erstellen
			if (!Files.exists(file)) {
				Files.createFile(file);
			}

		} catch (IOException e) {
			System.out.println("IOException bei der Initialisierung: "
					+ e.toString());
			System.exit(-1);
		}

		//
		// Daten schreiben, lesen und ausgeben
		//
		try (FileChannel fc = (FileChannel.open(file, READ, WRITE))) {

			
			// Daten schreiben
			for (int i = 1; i <= 1000; i++) {
				String line = "Das Quadrat von " + i + " = " + i * i + "\n";
				ByteBuffer wbuf = ByteBuffer.wrap(line.getBytes());
				fc.write(wbuf);
			}
			
			// Daten lesen 
			ByteBuffer rbuf = ByteBuffer.allocate((int)fc.size());
			fc.position(0);

			fc.read(rbuf);

			// Daten ausgeben
			System.out.println("Ausgabe Testdaten:");
			System.out.println(new String(rbuf.array()));

		} catch (IOException e) {
			System.out.println("IOException beim Schreiben oder Lesen der Daten: " + e.toString());
			System.exit(-1);
		}

	}

}
