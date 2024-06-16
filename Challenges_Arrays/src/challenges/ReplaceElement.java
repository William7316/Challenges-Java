package challenges;

import java.util.Scanner;

public class ReplaceElement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insert array values: ");
		String values = scan.nextLine().replace(" ", "");
		
		String[] string = values.split(",");
		
		int[] arr = new int[string.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(string[i]);
		}
		
		System.out.print("Enter the number to be exchanged: ");
		int n1 = scan.nextInt();
		
		System.out.print("Enter the new number: ");
		int n2 = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == n1) {
				arr[i] = n2;
			}
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		scan.close();
	}
}
