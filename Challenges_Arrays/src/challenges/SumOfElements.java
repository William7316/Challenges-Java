package challenges;

public class SumOfElements {

	public static void main(String[] args) {
		
		int[] nums = {2, 3, 5, 7, 9};
		
		int totalSum = 0;
		for(int num : nums) {
			totalSum += num;
		}
		
		System.out.println("Sum of all numbers: " + totalSum);
	}
}
