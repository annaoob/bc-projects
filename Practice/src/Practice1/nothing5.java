package Practice1;

import java.util.*;

public class nothing5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int i = 0;
		int j = 0;
		int count = 1;
		int n = size;
		int array [][] = new int [size][size];
		
		/*
		//prints array
		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				System.out.print(array[x][y] + " ");
			}
			System.out.println();
		}
		*/
		
		int prevLeftVertical = 0;
		int prevRightVertical = 0;
		int howMuchOfLineFinished = 0;
		int cur = size * size;
		if (size % 2 == 0) {
			printLine(size, cur, false);
		}
		
		/*
		while (count <= size*size) {
			int n1 = n;
			while (n1>0) {
				array[i][j] = count;
				j++;
				count++;
				n1--;
			}
			n1 = n-1;
			j--;
			i++;
			while (n1>0) {
				array[i][j] = count;
				i++;
				count++;
				n1--;
			}
			i--;
			j--;
			n1 = n-1;
			while (n1>0) {
				array[i][j] = count;
				j--;
				count++;
				n1--;
			}
			j++;
			i--;
			n1 = n-2;
			while (n1 > 0) {
				array[i][j] = count;
				i--;
				count++;
				n1--;
			}
			n-=2;
			i++;
			j++;
			
		}
		
		*/
		
		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				System.out.print(array[x][y] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void printLine(int length, int start, boolean inOrder) {
		int cur = start;
		int howManyPrinted = 0;
		while (howManyPrinted < length) {
			System.out.print(cur + " ");
			howManyPrinted++;
			if (inOrder) { cur++; }
			else { cur--; }
		}
	}
}
