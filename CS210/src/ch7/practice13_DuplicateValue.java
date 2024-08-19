package ch7;

import java.util.*;

public class practice13_DuplicateValue {

	public static void main(String[] args) {
		
		int[] myArray = {1, 2, 3, 3, 4, 5, 6, 2};
		
		ArrayList<Integer> duplicates = new ArrayList<>();
		
		for (int i = 0; i < myArray.length; i++) {
			
			for (int j = 0; j < myArray.length; j++) {
				
				if (i != j && myArray[i] == myArray[j] && Collections.binarySearch(duplicates, myArray[i]) < 0) {
					
					System.out.println("Duplicate Element: " + myArray[i]);
					duplicates.add(myArray[i]);
					
				}
				
			}
	
		}

	}

}
