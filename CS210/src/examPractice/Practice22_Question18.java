/* 
 * CS210 Practice 22 - Question 18
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.03.17 - Winter Quarter
 *
 * This program asks the user for a string and checks if the length is even 
 * and if the string has an equal amount of lower and upper case
 */

package examPractice;

import java.util.*;

public class Practice22_Question18 {

	public static void main(String[] args) {
		
		//Sets up a way to ask for user input
		Scanner input = new Scanner (System.in);
		
		//Creates a String s
		String s = null;
		
		//the program asks the user to input a string and sets s equal to the user's input
		do {
			System.out.print("input a string: ");
			s = input.next();
		}
		//the program does the do statements while the string entered by the user doesn't have an even length
		//or doens't have the same amount of lower and upper case
		while (!Even(s) || !EqualCase(s));
		
		//after the do-while loop is bypassed, the string must've fulfilled the requirements and
		//therefore has an even length and the same number of upper and lower case
		//the program prints "bye!"
		System.out.println("bye!");
		
		//closes the input
		//No more way to get input
		input.close();

	}
	
	public static boolean Even(String s) {
		//this method checks to see if the length of the string parameter s is even
		
		//returns true if the remainder when the length of s is divided by 2 is 0
		return (s.length()%2 == 0);
	}
	
	public static boolean EqualCase(String s) {
		//this method checks to see if the string parameter s has an equal number of lower and upper case
		
		//creates two int variables that will count how many lower and upper case there is
		int lower = 0;
		int upper = 0;
		
		//for all the characters in string s, the for loop checks if it's an upper or lower case
		for (int i = 0; i < s.length(); i++ ) {
			
			//If the character is a lower case, lower increases by one
			if (Character.isLowerCase(s.charAt(i))) {
				lower++;
			}
			
			//Else if the character is upper case, upper increases by one
			else if (Character.isUpperCase(s.charAt(i))) {
				upper++;
			}
		}
		
		//returns true if the number of upper and lower case is the same
		return (lower == upper);
		
	}
	
}
