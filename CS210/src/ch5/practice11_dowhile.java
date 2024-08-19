/* 
 * CS210 Practice 11 (do-while)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.02.03 - Winter Quarter
 *
 * This program asks user for three integers
 * If the first two integers are equal to each other, 
 * and their sum is less that the third integer, the program says "you are a genius, Bye!"
 * Otherwise, the program asks the user to input again
 */

package ch5;

import java.util.*;

public class practice11_dowhile {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first;
		int second;
		int third;
		
		do {
			System.out.println("input first number: ");
			first = input.nextInt();
			System.out.println("input second number: ");
			second = input.nextInt();
			System.out.println("input third number: ");
			third = input.nextInt();
			checkNumbers(first, second, third);
			if (!checkNumbers(first,second,third)) {System.out.println("\nInput again\n");}
		} while (!checkNumbers(first, second, third));
		
		System.out.println("you are a genius, Bye! ");
	}
	
	public static boolean checkNumbers(int first, int second, int third) {
		return ((first==second) && (first+second<third)); 
	}

}
