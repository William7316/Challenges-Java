package challenges;

public class UnitConverter {

	public static void main(String[] args) {
		
		System.out.println(metersToCentimeters(2.0));
		System.out.println(metersToCentimeters(4.5879, true));
		
	}

	private static double metersToCentimeters(double meters) {
		return meters * 100;
	}
	
	private static int metersToCentimeters(double meters, boolean round) {
		if(round) {
			return (int) Math.round(meters *100);
		} else {
			return (int) (meters * 100);
		}
	}
	
}
