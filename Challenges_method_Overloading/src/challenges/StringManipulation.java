package challenges;

public class StringManipulation {

	public static void main(String[] args) {

		System.out.println(CountLetters("Hello world."));
		System.out.println(CountLetters("Hello world.", 'l'));

	}

	private static int CountLetters(String text) {
		int count = 0;
		
		for(char c: text.toCharArray()) {
			count++;
		}
		return count;
	}

	private static int  CountLetters(String text, char letter) {
		int count = 0;
		
		for(char c: text.toCharArray()) {
			if(c == letter) {
				count++;
			}
		}
		return count;
	}
}
