/* 
 * CS210 Assignment 03 (User IDs)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.02.17 - Winter Quarter
 *
 * This program reads out current user IDs and asks user to create new ID.
 * While the ID entered doesn't follow the rules, the program explains the problem with the ID
 * and asks for a new ID. When the ID is good, the program adds the ID to the file with IDs.
 * Next time the program runs, the new ID will be read out with all the current IDs.
 */

package ch7;

import java.io.*;
import java.util.*;

public class UserIDs {

	static final int minLength = 4;
	static final int maxLength = 8;
	
	public static void main(String[] args) throws FileNotFoundException {
		//Sets up a way to ask for user input and a way to read the IDs files
		Scanner input = new Scanner (System.in);
		Scanner text = new Scanner (new File ("IDs.txt"));
				
		//Sets up an ArrayList IDs with all of the IDs
		ArrayList<String> IDs = new ArrayList<>();
				
		//While the IDs files has more IDs, the ArrayList IDs adds all of them
		while (text.hasNext()){
			IDs.add(text.next());
		}
		
		//Prints out "List of User IDs" and how many IDs there are in ()
		System.out.println("List of User IDs (" + IDs.size() + ")");
				
		//The program prints out all of the IDs in the ArrayList IDs
		for (int i = 0; i < IDs.size(); i++){
			System.out.println(IDs.get(i));
		}
		
		//Creates string id
		String id = null;
		
		//Program declares id to be the id the user enters
		//If the id violates any of the rules, it prints out "invalid id" and what rule was violated
		do {
			System.out.print("\nCreate new ID: ");
			id = input.next();
			if (!checkNotDuplicate(IDs, id) || !checkLength(id) || !checkCase(id) || !checkLetter(id) || !checkNumber(id) || !checkSpecialCharacter(id)) { System.out.println("Invalid ID."); }
			if (!checkNotDuplicate(IDs, id)) { System.out.println("ID already in use."); }
			if (id.length() < minLength) { System.out.println("ID is too short."); }
			if (id.length() > maxLength) { System.out.println("ID is too long."); }
			if (!checkCase(id)) { System.out.println("ID must have lower-case and upper-case."); }
			if (!checkLetter(id)) { System.out.println("ID must start with a letter."); }
			if (!checkNumber(id)) { System.out.println("ID must have at least one number."); }
			if (!checkSpecialCharacter(id)) { System.out.println("ID must have at least one special character."); }
		
		//The program does the the do while loop while the id the user enters violates one or more of the rules
		} while (!checkNotDuplicate(IDs, id) || !checkLength(id) || !checkCase(id) || !checkLetter(id) || !checkNumber(id) || !checkSpecialCharacter(id));
		
		//If the id bypassed the while loop, it means the id is good
		//Program prints out a message saying id was created
		System.out.println("ID " + id + " created successfully! \n");
		
		//Program adds the good id to the ArrayList IDs
		IDs.add(id);
		
		//Prints out "List of User IDs" and how many IDs there are in ()
		//There should be one more ID than before
		System.out.println("List of User IDs (" + IDs.size() + ")");
		
		//Prints out all the IDs in the Array List IDs
		for (int i = 0; i < IDs.size(); i++){
			System.out.println(IDs.get(i));
		}
				
		//Sets up a way to add IDs to the IDs file
		PrintStream out = new PrintStream("IDs.txt");
				
		//Adds all the IDs in the ArrayList IDs to the IDs file, including the new ID
		for (int i = 0; i < IDs.size(); i++){
			out.println(IDs.get(i));
		}
				
		//Closes the out and input
		//No more way to get input or to add IDs to the the IDs file
		out.close();
		input.close();

	}
	
	public static boolean checkNotDuplicate(ArrayList<String> IDs, String id) {
		//This method checks that the ID is not a duplicate
		
		//Checks all the IDs in the ArrayList IDs to see if they match the id the user entered
		for (int i = 0; i < IDs.size(); i++){
			
			//If the id the user entered matches with any ID in the ArrayList IDs, the method return false
			if (IDs.get(i).equals(id)) {
				   return false;
			}
		}
		
		//Otherwise, the method returns true
		return true;
	}
	
	public static boolean checkLength(String id) {
		//This method checks the length of the id.
		//If the id is between 4 and 7 characters long, it returns true.
		//Otherwise, the method returns false.
		return (id.length() >= minLength && id.length() <= maxLength);
	}
	
	public static boolean checkCase(String id) {
		//This method checks if the id has lower case and upper case
		
		//Creates booleans lower and upper and sets them both to false
		boolean lower = false;
		boolean upper = false;
		
		//For every character in the id, the if statement checks if that character is lower case or upper case
		for (int i = 0; i < id.length(); i++ ) {
			
			//If the character is a lower case, lower is true
			if (Character.isLowerCase(id.charAt(i))) {
				lower = true;
			}
			
			//Else if the character is upper case, upper is true
			else if (Character.isUpperCase(id.charAt(i))) {
				upper = true;
			}
		}
		
		//If the id has both lower and upper case, then both lower and upper is true
		//If both lower and upper is true, the method returns true
		//Otherwise, the method returns false
		return (lower && upper);
	}
	
	public static boolean checkLetter(String id) {
		//This method checks if the id starts with a letter.
		//If the id starts with a letter, it returns true.
		//Otherwise, the method returns false.
		return (Character.isLetter(id.charAt(0)));
	}
	
	public static boolean checkNumber(String id) {
		//This method checks if the id has a number.
		
		//For every character in the id, the if statement checks if that character is a digit
		for (int i = 0; i < id.length(); i++) {
			
			//If the character is a digit, the method returns true
			if (Character.isDigit(id.charAt(i))) {
				return true;
			}
		}
		
		//Otherwise, the method return false
		return false;
	}
	
	public static boolean checkSpecialCharacter(String id) {
		//This method checks if the id has a special character
		
		//For every character in the id, the if statement checks if that character is a digit
		for (int i = 0; i < id.length(); i++) {
			
			//If the character is a digit, the method returns true
			if (!Character.isLetterOrDigit(id.charAt(i))) {
				return true;
			}
		}
		
		//Otherwise, the method returns false
		return false;
	}

}
