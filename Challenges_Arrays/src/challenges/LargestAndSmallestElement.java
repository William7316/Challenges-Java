package challenges;

public class LargestAndSmallestElement {

	public static void main(String[] args) {
		
		int[] nums = {3, 1, 6, 5, 2, 9,8};
		
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			largest = nums[i] > largest ? nums[i] : largest;
			smallest = nums[i] < smallest ? nums[i] : smallest;
		}
		
		System.out.println("The largest element is: " + largest);
		System.out.println("The smallest element is: " + smallest);
		
	}
}
