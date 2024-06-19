package challenges;

import java.util.Scanner;

public class FindSubstring {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Insert the word: ");
		String word = scan.nextLine();
		
		System.out.print("Enter the substring to see if it is present in the word: ");
		String substring = scan.nextLine();
		
		boolean contain;
		if(word.contains(substring)) {
			contain = true;
		}else {
			contain = false;
		}
		
		System.out.print("Contains substring: " + contain);
		
		scan.close();
	}
}
