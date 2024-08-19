/* 
 * CS210 Assignment 01 (Practice 4 - Scanner and Parameters)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.18.13 - Winter Quarter
 *
 * This program writes the symbol you want 
 * the number of times you want
 */

package ch2;
import java.util.*;
public class practice4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Input a symbol: ");
		String s = input.next();
		System.out.println("How many " + s + " would you like to draw?");
		int num = input.nextInt();;
		
		input.close();
		
		draw(s, num);
	}
	
	public static void draw(String s, int num) {
		for (int i=1; i<=num; i++) {
			System.out.println(s);
		}
	}
}
