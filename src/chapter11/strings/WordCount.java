package chapter11.strings;

import java.util.StringTokenizer;

public class WordCount {

	public static void main(String[] args) {
		count("Heute ist sch�nes Wetter.");
		count("Am morgen habe ich frei.");
	}
	
	public static void count(String sentence) {
		
		StringTokenizer st = new StringTokenizer(sentence, " ");

		System.out.println("Count: " + sentence);
		System.out.println("  Anzahl Worte = " + st.countTokens());
	}

}
