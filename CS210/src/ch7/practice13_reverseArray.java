package ch7;

import java.util.Arrays;

public class practice13_reverseArray {

	public static void main(String[] args) {
		
		int[] myArray = {1, 3, 5, 7, 8, 9, 11, 13, 15, 17};
		myArray = reverseArray(myArray);
		System.out.println(Arrays.toString(myArray));
	
	}
	
	public static int[] reverseArray (int[] my_array) {
		
		for (int i = 0; i < (my_array.length / 2); i++) {
			
			int temp = my_array[i];
			my_array[i] = my_array[my_array.length - 1 - i];
			my_array[my_array.length - 1 - i] = temp;
		}
		
		return my_array;
	}
}
