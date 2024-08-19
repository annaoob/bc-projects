/* 
 * CS210 Bonus Practice 2 (booleanZen)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.02.02 - Winter Quarter
 *
 * This program asks user for two integers and checks if they're equal
 * If the integers are equal, the program prints "you are a genius! Bye!"
 * If the integers are not equal, the program asks the user to try again
 * and prompts the user to enter another 2 integers
 */

package ch5;

import java.util.*;

public class bonuspractice_booleanZen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("input 1st number: ");
		int num1 = input.nextInt();
		System.out.println("input 2nd number: ");
		int num2 = input.nextInt();
		while (!checkIfEquals(num1,num2)) {
			System.out.println("try again \n");
			System.out.println("input 1st number: ");
			num1 = input.nextInt();
			System.out.println("input 2nd number: ");
			num2 = input.nextInt();
			checkIfEquals(num1,num2);
		}
		System.out.println("you are a genius! Bye! ");
		input.close();
	}
	
	public static boolean checkIfEquals(int num1, int num2) {
		return (num1==num2);
	}

}
