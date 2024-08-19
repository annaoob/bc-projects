package Practice1;

import java.util.*;

public class nothing6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int length = 2*size-1;
		int width = size;
		
		int start = size-1;
		//int rowNumber = 0;
		int array [][] = new int [length][width];
		
		
		for (int columnNumber = 0; columnNumber < width; columnNumber++) {
			int rowNumber = start;
			for (int numOfOnes = 0; numOfOnes < 2*columnNumber+1; numOfOnes++ ) {
				array[rowNumber][columnNumber] = 1;
				rowNumber++;
			}
			start--;
		}
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
