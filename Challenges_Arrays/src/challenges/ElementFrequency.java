package challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElementFrequency {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Insert array values: ");
		String values = scan.nextLine().replace(" ", "");

		String[] string = values.split(",");

		int[] arr = new int[string.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(string[i]);
		}
		
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		
		for(int num : arr) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num,  0) + 1);
		}
		
		System.out.println("Element frequencies: " + frequencyMap);
	
	}
	
}
