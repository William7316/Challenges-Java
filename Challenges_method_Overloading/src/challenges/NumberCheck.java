package challenges;

public class NumberCheck {

	public static void main(String[] args) {
		
		System.out.println(isPositive(3));
		System.out.println(isPositive(4.5));
		
	}

	private static boolean isPositive(int number) {
		return number > 0 ;
	}
	
	private static boolean isPositive(double number) {
		return number > 0;
	}
	
}
