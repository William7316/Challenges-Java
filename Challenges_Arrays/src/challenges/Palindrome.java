package challenges;

public class Palindrome {

	public static void main(String[] args) {
		
		char[] letters = {'A', 'N', 'A'};
		
		StringBuilder letterToString = new StringBuilder();
		
		for(char letter : letters) {
			letterToString.append(letter);
		}
		
		String sBToString = letterToString.toString();
		
		boolean isPalindrome = sBToString
				.equalsIgnoreCase(letterToString.reverse().toString());
		
		System.out.println("Is palindrome: " + isPalindrome);
		
	}
	
}
