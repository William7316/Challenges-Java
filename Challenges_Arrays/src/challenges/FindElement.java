package challenges;

import java.util.Arrays;
import java.util.Scanner;

public class FindElement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insert array values: ");
		String values = scan.nextLine().replace(" ", "");
		
		String[] string = values.split(",");
		
		int[] arr = new int[string.length];
		
		for (int i = 0; i < string.length; i++) {
			arr[i] = Integer.parseInt(string[i]);
		}
		
		System.out.print("Insert the element to be searched for: ");
		int searched = scan.nextInt();
		
		boolean isFind = Arrays.stream(arr).anyMatch(i -> i == searched);
		
		System.out.println("Value found: " + isFind);
		
		scan.close();
	}
}
