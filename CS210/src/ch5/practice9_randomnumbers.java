/* 
 * CS210 Practice 8 (While Loop)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.01.31 - Winter Quarter
 *
 * This program asks a user to give it 2 numbers,
 * checks if those numbers are between 0 and 99,
 * and if they are, the program prints a random number 
 * between those two numbers
 */

package ch5;

import java.util.*;

public class practice9_randomnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		boolean stop = false;
		while (stop == false) {
			System.out.print("input first number: ");
			int num1 = input.nextInt();
			System.out.print("input second number: ");
			int num2 = input.nextInt();
			
			if (num1 <= 99 && num2 <= 99 && num1 >= 0 && num2 >= 0 && num1!=num2) {
				int ub = Math.max(num1, num2);
				int lb = Math.min(num1, num2);
				int range = ub-lb+1;
				Random rand = new Random();
				int randomNumber = rand.nextInt(range) + lb;
				System.out.println("\nYou random number is " + randomNumber);
				stop = true;
				input.close();
			}
			
			else {
				if (num1 > 99 || num2 > 99) {
					System.out.println("Must be <= 99. Input again");
				}
				if (num1 < 0 || num2 < 0) {
					System.out.println("Must be >= 0. Input again");
				}
				if (num1 == num2) {
					System.out.println("Can't be the same. Input again");
				}
				System.out.println();
			}
		}
	}

}
