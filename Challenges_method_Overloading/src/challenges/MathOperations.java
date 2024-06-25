package challenges;

public class MathOperations {

	public static void main(String[] args) {
		
		System.out.println(calculateAreaRectangle(10.2, 20.5));
		System.out.println(calculateAreaRectangle(12.5));
		
	}

	private static double calculateAreaRectangle(double height, double width) {
		return height * width;
	}
	
	private static double calculateAreaRectangle(double side) {
		return  Math.pow(side, 2);
	}
}
