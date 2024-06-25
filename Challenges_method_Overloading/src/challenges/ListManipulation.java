package challenges;

public class ListManipulation {

	public static void main(String[] args) {
		
		int[] numbers = {1, 5, 9, 7, 6, 10, 35, 8};
		double[] numbersDouble = {1.5, 2.5, 7.9, 8.8};
		
		System.out.println(average(numbers));
		System.out.println(average(numbersDouble));
		
	}

	private static double average(int[] numbers) {
		int sum = 0;
		for(int n : numbers) {
			sum += n;
		}
		return (double) sum / numbers.length;
	}
	
	private static double average(double[] numbersDouble) {
		double sum = 0;
		for(double n : numbersDouble) {
			sum += n;
		}
		return sum / numbersDouble.length;
	
	}
	
}
