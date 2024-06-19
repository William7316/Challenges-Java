package challenges;

import java.util.Scanner;

public class ReplaceCharacters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a word: ");
		String oldWord = scan.nextLine();
		
		System.out.print("Enter the letter to replace it: ");
		char oldLetter = scan.next().charAt(0);
		
		System.out.print("Enter the new letter: ");
		char newLetter = scan.next().charAt(0);
		
		StringBuilder sb = new StringBuilder();
		for(char c: oldWord.toCharArray()) {
			if(String.valueOf(c).equalsIgnoreCase(String.valueOf(oldLetter))) {
				sb.append(newLetter);
			}else {
				sb.append(c);
			}
		}
		
		String newWord = sb.toString();
		
		System.out.println("New word: " + newWord);
		
		scan.close();
	}
}
