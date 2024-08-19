package Practice1;

import java.util.*;

public class nothing8 {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int array [][] = new int [size][size];
		int x = 0;
		int y = 0;
		int count = 1; //what number to write
		int totalInDiagonal = 1; //how many elements in a diagonal
		int doneInDiagonal = 0; // how many elements did we write a number for in a diagonal
		int diagonals = 0; //number of diagonals
		boolean increase = true; //total of elements in diagonal will increase until the largest diagonal, and then decrease
		
		while (count <= size*size) {
			doneInDiagonal = 0; //reset how many elements of a diagonal we finished
			
			//while we haven't finished all the elements in a diagonal
			while (doneInDiagonal < totalInDiagonal) {
				array [y][x] = count;
				
				//if diagonal # is positive, we move up the diagonal
				if (diagonals % 2 == 0) {
					x++; 
					y--;
				//if diagonal # is negative, we move down the diagonal
				} else { 
					x--;
					y++;
				}
				
				doneInDiagonal++; //since we wrote a number in the diagonal, we increase the number of elements we wrote in the diagonal
				count++; //since we wrote a number in the array, we increase count
			}
			
			//inside while loop stops when diagonal is filled, so we increase the number of diagonals we finished
			diagonals++;
			
			//the largest diagonal we'll do will have "size" number of elements
			//when we finish the largest diagonal, the number of the total elements in future diagonals will decrease
			//this is why we need to change increase to false, to stop increase totalInDiagonal
			if (totalInDiagonal == size) {
				increase = false;
			}
			
			//while the size of diagonals is changing, with every new diagonal we need to "reset" the x's and y's
			//when we do the last element in a diagonal, we still move the x's and y's up or down the diagonal
			
			//while the size of the diagonals is increasing, we need to check if we'll be moving up or down the next diagonal
			if (increase) {	
				totalInDiagonal++; 
				
				//if we will be moving up the diagonal, it means we were moving down the diagonal we just did (x--, y++)
				//when the size of the diagonals is increasing, 
				//the start of the new diagonal is directly below the last element of the past diagonal, (y++), 
				//which we did in the inner while loop
				//but we need to offset the (x--) we did in the inner loop, so we x++
				if (diagonals % 2 == 0) {
					x++;
				} 
				//if we will be moving down the diagonal, it means we were moving up the diagonal we just did (x++, y--)
				//when the size of the diagonals is increasing, 
				//the start of the new diagonal is directly to the right of the last element of the past diagonal, (x++), 
				//which we did in the inner while loop
				//but we need to offset the (y--) we did in the inner loop, so we y++
				else { 
					y++;
				}
			//while the size of the diagonals is decreasing, we need to check if we'll be moving up or down the next diagonal
			} else {
				totalInDiagonal--; 
				
				//if we will be moving up the diagonal, it means we were moving down the diagonal we just did (x--, y++)
				//when the size of the diagonals is decreasing, 
				//the start of the new diagonal is directly to the right of the last element of the past diagonal, (x++),
				//we need to offset the (x--, y++) we did in the inner loop to get (x++), so we increase x by 2 and y--
				if (diagonals % 2 == 0) {
					x+=2;
					y--;
					
				//if we will be moving up the diagonal, it means we were moving down the diagonal we just did (x++, y--)
				//when the size of the diagonals is decreasing, 
				//the start of the new diagonal is directly below the last element of the past diagonal, (y++),
				//we need to offset the (x++, y--) we did in the inner loop to get (y++), so we increase y by 2 and x--
				} else { 
					y+=2;
					x--;
				}
			}
		}
		
		//prints array
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
