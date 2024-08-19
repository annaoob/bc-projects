package ch7;

public class practice13_AboveAverage {

	public static void main(String[] args) {
		
		int[] myArray = {1, 2, 3, 3, 4, 5, 6, 2};
		
		double counter =  0.0;
		
		for (int i = 0; i < myArray.length; i++) {
			
			counter += myArray[i];
		
		}
		
		double average = counter / myArray.length;
		System.out.println("Average: " + average);
		System.out.println("Element > 3.25 is");
		
		for (int i = 0; i < myArray.length; i++) {
			
			if (myArray[i] > average) {
				
				System.out.println(myArray[i]);
			
			}
		
		}

	}

}
