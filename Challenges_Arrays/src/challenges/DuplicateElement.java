package challenges;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {

	public static void main(String[] args) {
		
		int[] nums = {1, 5, 7, 5, 3, 4, 3, 7, 1, 2, 4, 3};
		
		Set<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toSet());
		
		System.out.println("List without duplicate elements : " + list);
		
	}
}