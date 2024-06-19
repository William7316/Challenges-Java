package challenges;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a word: ");
		String word = scan.nextLine();
		
		StringBuilder sb = new StringBuilder(word);
		
		sb.reverse();
		
		String newWord = sb.toString();
		
		boolean isPalindrome = word.equalsIgnoreCase(newWord);
		
		String result = isPalindrome ? "Is a palindrome!" : "Is not a palindrome!";
		
		System.out.println("'" + word + "' " + result);
		
		
		scan.close();
	}
}
