package challenges;

import java.util.Scanner;

public class ExtractSubstring {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a text: ");
		String text = scan.nextLine();
		
		System.out.println("Enter the index of the start and the end of the substring: ");
		String index = scan.nextLine().trim();
		
		String[] indices = index.split(",");
		
		if (indices.length != 2) {
            System.out.println("Invalid input format. Please enter two indices separated by comma.");
            scan.close();
            return;
		}
		
		try {
			int startIndex = Integer.parseInt(indices[0].trim());
            int endIndex = Integer.parseInt(indices[1].trim());
            
            if(startIndex < 0 || endIndex > text.length() || startIndex >= endIndex) {
                System.out.println("Invalid indices. Please enter valid indices within the range of the text length.");
            } else {
                String newSubstring = text.substring(startIndex, endIndex);
                System.out.println("Text with substring: " + newSubstring);
            }
			
		} catch (NumberFormatException e) {
            System.out.println("Invalid input format. Indices must be integers.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds. Please ensure indices are within the range of the text length.");
        }
		
		
		scan.close();
	}

}
