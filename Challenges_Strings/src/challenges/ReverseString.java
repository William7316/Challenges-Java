package challenges;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a word: ");
		String word = scan.nextLine();
		
		StringBuilder sb = new StringBuilder(word);
		
		sb.reverse();
		
		String newWord = sb.toString();
		
		System.out.println("Inverted string: " + newWord);
		
		scan.close();
	}
}
