package challenges;

import java.util.Arrays;
import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Insert the words: ");
		String words = scan.nextLine();
		
		int wordQuantities = (int) Arrays.stream(words.split(" ")).count();
		
		System.out.println("Word quantities: " + wordQuantities);
		
		scan.close();
	}
}
