package challenges;

public class AverageOfElements {

	public static void main(String[] args) {
		int[] nums = {1, 6, 8, 9, 4};
		
		int sum = 0;
		for(int num : nums) {
			sum += num;
		}
		
		double average = (double) sum / nums.length;
		
		System.out.println("The average is: " + average);
		
	}
}
