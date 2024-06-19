package challenges;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a word: ");
		String word = scan.nextLine();
		
		int numberOfVowels = countVowels(word);
		
		System.out.println(word + " has " + numberOfVowels + " vowels!");
		
		scan.close();
	}

	private static int countVowels(String str) {
	
		int count = 0;
		for(char c: str.toCharArray()) {
			switch(c) {
			case 'a', 'A','e', 'E','i', 'I','o', 'O', 'u', 'U'
				:
				count++;
			}
		}
		
		return count;
	}
}
