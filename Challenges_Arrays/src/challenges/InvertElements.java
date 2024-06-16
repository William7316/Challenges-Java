package challenges;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class InvertElements {

	public static void main(String[] args) {
		
		int[] nums = {6, 1, 4, 3, 2, 5, 4, 2, 7, 3, 3, 9};
		int[] invertNums = new int[nums.length];
		
		for(int i = nums.length; i > 0; i--) {
			invertNums[nums.length - i] = nums[i - 1];
		}
		
		IntConsumer format = i -> System.out.print(i + " ");
		
		
		System.out.println("inverted elements:");
		Arrays.stream(invertNums).forEach(format);
	}
}
