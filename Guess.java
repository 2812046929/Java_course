package exercise03;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		guess_word(sc);
		System.out.println("Do you want to guess another word? Enter y or n:");
		while(sc.next().equals("y")){
			guess_word(sc);
			System.out.println("Do you want to guess another word? Enter y or n:");
		}
		if (sc != null)
			sc.close();
	}

	public static void guess_word(Scanner sc) {

		String[] words = { "program", "brisk", "inevitable","intelligent","notify","recognition" };
		Random r = new Random(1);
		int index = r.nextInt(words.length);
		String word = words[index];
		int len = word.length();
		char[] letters = new char[len];
		for (int i = 0; i < len; i++)
			letters[i] = '*';
		char[] wordchar = word.toCharArray();

		int count = 0;
		while (String.valueOf(letters).equals(word) == false) {
			System.out.print("Enter a letter in word " + String.valueOf(letters));
			char input = sc.next().toCharArray()[0];
			if (word.indexOf(input) != -1) {// contains
				if (String.valueOf(letters).indexOf(input) != -1) {// has been read
					System.out.print(input + " is already in the word");
				} else {
					for (int i = 0; i < len; i++) {
						if (wordchar[i] == input) {
							letters[i] = input;
						}
					}
					if (String.valueOf(letters).equals(word) == true) {
						if(count<=1)
							System.out.println("The word is " + word + ". You missed " + count + " time");
						else 	
							System.out.println("The word is " + word + ". You missed " + count + " times");
						break;
					}

				}
			} else {
				System.out.println(input + " is not in the word");
				count++;
			}
		}

	}
}
