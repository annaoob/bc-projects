/* 
 * CS210 Practice 22 - Question 18
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.03.24 - Winter Quarter
 *
 * This program asks the user for a string and checks if the length is less than 9 
 * and if the string has the same first and last characters
 */

package finalExam;

import java.util.Scanner;

public class FinalExam_Question16 {

	static int maxLength = 9;
	
	public static void main(String[] args) {
		//Sets up a way to ask for user input
		//Sets up a way to ask for user input
		Scanner input = new Scanner (System.in);
		
		//Creates a String s
		String s = null;
				
		//the program asks the user to input a string and sets s equal to the user's input
		do {
			System.out.print("input a string: ");
			s = input.next();
		}
		//the program does the do statements while the string entered by the user has a length that's less than 9
		//or the first and last characters of the string entered by the user are not equal
		while (!CorrectLength(s) || !FirstAndLastEqual(s));
				
		//after the do-while loop is bypassed, the string must've fulfilled the requirements and
		//therefore has a length that is less than 9 and the same first and last characters
		//the program prints "bye!"
		System.out.println("bye!");
				
		//closes the input
		//No more way to get input
		input.close();

	}
			
	public static boolean CorrectLength(String s) {
		//this method checks to see if the length of the string parameter s is less than 9
		
		return (s.length() < maxLength);
	}
			
	public static boolean FirstAndLastEqual(String s) {
		//this method checks to see if the first character of the string s is equal to the last character of the string s
		
		return (String.valueOf(s.charAt(0)).equals(String.valueOf(s.charAt(s.length()-1))));
	}

}
