/* 
 * CS210 Midterm Exam Part 2
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.02.14 - Winter Quarter
 * 
 * This program creates a new ID. It asks the user to input an ID
 * and checks if the ID is between 4 and 7 characters long, 
 * starts with a letter, has at least one number, and has matching
 * first and last characters. If the ID doesn't fulfill the requirements,
 * the program tells the user that that ID is invalid,
 * and prompts them to enter a new ID.
 */

package ch6;

import java.util.*;

public class midtermExamPart2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String id = null;
		
		//The program asks the user to input an ID and prints out an error message if
		//the ID is bad. It does this while the ID doesn't fulfill the requirements.
		
		do {
			
			System.out.print("Input new iID: ");
			id = input.next();
			
			if (!checkLength(id)) {
				System.out.println(id + " is invalid. ID must be between 4 and 7 "
						+ "characters in length. \n");
			}
			else if (!checkLetter(id)) {
				System.out.println(id + " is invalid. ID must start with a letter. \n");
			}
			else if (!checkNumber(id)) {
				System.out.println(id + " is invalid. ID must have at least one number "
						+ "like [0-9]. \n");
			}
			else if (!checkFirstAndLast(id)) {
				System.out.println(id + " is invalid. The first character and "
						+ "the last character of the ID must be the same. \n");
			}
			
		} while (!checkLength(id) || !checkLetter(id) || !checkNumber(id) || !checkFirstAndLast(id));
		
		//After the while loop has been cleared, which means that the ID is correct
		//The program prints out a message saying that the ID has been created.
		System.out.println("Congratulations! " + id + " has been successfully created");
		
		input.close();
	}

	public static boolean checkLength(String id) {
		
		//This method checks the length of the ID.
		//If the ID is between 4 and 7 characters long, it returns true.
		//Otherwise, the method returns false.
		
		return (id.length() >= 4 && id.length() <= 7);
	}
	
	public static boolean checkLetter(String id) {
		
		//This method checks if the ID starts with a letter.
		//If the ID starts with a letter, it returns true.
		//Otherwise, the method returns false.
		
		return (Character.isLetter(id.charAt(0)));
	}
	
	public static boolean checkNumber(String id) {
		
		//This method checks if the ID has a number.
		//If the ID has a number, it returns true.
		//Otherwise, the method returns false.
		
		for (int i = 0; i < id.length(); i++) {
			
			if (Character.isDigit(id.charAt(i))) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean checkFirstAndLast(String id) {
		
		//This method checks if the ID starts and ends with the same character
		//If the ID starts and ends with the same character, it returns true.
		//Otherwise, the method returns false.
		
		return (id.charAt(0) == id.charAt(id.length()-1));
	}

}
