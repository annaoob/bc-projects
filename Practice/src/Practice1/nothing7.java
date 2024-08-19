package Practice1;

import java.util.*;

public class nothing7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int array [][] = new int [3][size];
		int column = 0;
		boolean increase = true;
		int numOfOnes = 1;
		//the next 3 lines are a part of the unfinished and not working code
		//int x = 0;
		//int y = 0;
		//int count = 2;
		
		
		while (column < size) {
			printColumn(column, numOfOnes, array);
			if (numOfOnes==3) { increase = false; }
			if (numOfOnes==1) { increase = true; }
			if (increase) { numOfOnes++; }
			else { numOfOnes--; }
			column++;
		}
		
		
		/*
		// unfinished and not working code, only prints the first half on the first pyramid
		while (x<3) {
			y = 2;
			while (y>=count) {
				array[y][x] = 1;
				y--;
			}
			count--;
			x++;
		}
		*/
		
		
		//first loop puts ones in first row
		column=2;
		while (column<size) {
			array[0][column] = 1;
			column = column+4;
		}
		
		column=1;
		while(column<size) {
			int times = 0;
			while (times < 3 && column<size) {
				array[1][column] = 1;
				times++;
				column++;
			}
			column++;
		}
		
		column=0;
		while (column<size) {
			array[2][column] = 1;
			column++;
		}	
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
				
	}
	
	public static void printColumn(int column, int numOfOnes, int array[][]) {
		int y = 2;
		while (y>=3-numOfOnes) {
			array[y][column] = 1;
			y--;
		}
	}

}
