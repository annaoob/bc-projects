/* 
 * CS210 Assignment 01 (Methods - Clementine)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.01.13 - Winter Quarter
 *
 * This program writes one digit less of 1234 on each 
 * line
 */

package ch2;

public class lessNumbers {
	
	public static void main(String[] args) {
	
		for (int i=4; i>=1; i--) {
			for (int j=i-1; j>=0; j--) {
				System.out.print(i-j);
			}
			System.out.println();
		}
	}
}
