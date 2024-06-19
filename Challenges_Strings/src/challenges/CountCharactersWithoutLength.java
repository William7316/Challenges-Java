package challenges;

import java.util.Scanner;

public class CountCharactersWithoutLength {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = scan.nextLine();
		
		int result = countCaracteres(word);
		
		System.out.println("Number of characters: " + result);
		
		scan.close();
		
		}
	
	private static int countCaracteres(String str) {
		 int count = 0;
		 for(char c: str.toCharArray()) {
			 count++; 
		 }
		 
		 return count;
	}
	

}
