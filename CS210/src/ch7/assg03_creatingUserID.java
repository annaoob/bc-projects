package ch7;

import java.io.*;
import java.util.*;

public class assg03_creatingUserID {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		Scanner text = new Scanner (new File ("IDs.txt"));
		ArrayList<String> IDs = new ArrayList<>();
		while (text.hasNext()){
		    IDs.add(text.next());
		}
		
		System.out.println("List of User IDs (" + IDs.size() + ")");
		for (int i = 0; i < IDs.size(); i++){
			   System.out.println(IDs.get(i));
		}
		
		String id = null;
		
		do {
			System.out.print("\nCreate new ID: ");
			id = input.next();
			if (!checkNotDuplicate(IDs, id) || !checkLength(id) || !checkCase(id) || !checkLetter(id) || !checkNumber(id) || !checkSpecialCharacter(id)) {
				System.out.println("Invalid ID.");
			}
			if (!checkNotDuplicate(IDs, id)) { System.out.println("ID already in use."); }
			if (id.length() < 4) { System.out.println("ID is too short."); }
			if (id.length() > 8) { System.out.println("ID is too long."); }
			if (!checkCase(id)) { System.out.println("ID must have lower-case and upper-case."); }
			if (!checkLetter(id)) {System.out.println("ID must start with a letter."); }
			if (!checkNumber(id)) {System.out.println("ID must have at least one number."); }
			if (!checkSpecialCharacter(id)) {System.out.println("ID must have at least one special character."); }
		} while (!checkNotDuplicate(IDs, id) || !checkLength(id) || !checkCase(id) || !checkLetter(id) || !checkNumber(id) || !checkSpecialCharacter(id));
		
		System.out.println("ID " + id + " created successfully! \n");
		
		IDs.add(id);
		System.out.println("List of User IDs (" + IDs.size() + ")");
		for (int i = 0; i < IDs.size(); i++){
			   System.out.println(IDs.get(i));
		}
		
		PrintStream out = new PrintStream("IDs.txt");
		for (int i = 0; i < IDs.size(); i++){
			   out.println(IDs.get(i));
		}
		
		out.close();
		input.close();

	}
	
	public static boolean checkNotDuplicate(ArrayList<String> IDs, String id) {
		for (int i = 0; i < IDs.size(); i++){
			   if (IDs.get(i).equals(id)) {
				   return false;
			   }
		}
		return true;
	}
	
	public static boolean checkLength(String id) {
		
		//This method checks the length of the ID.
		//If the ID is between 4 and 7 characters long, it returns true.
		//Otherwise, the method returns false.
		return (id.length() >= 4 && id.length() <= 8);
	}
	
	public static boolean checkCase(String id) {
		boolean lower = false;
		boolean upper = false;
		for (int i = 0; i < id.length(); i++ ) {
			if (id.charAt(i) >= 'a' && id.charAt(i) <= 'z') {
				lower = true;
			}
			else if (id.charAt(i) >= 'A' && id.charAt(i) <= 'Z') {
				upper = true;
			}
		}
		return (lower && upper);
	}
	
	public static boolean checkLetter(String id) {
		
		//This method checks if the ID starts with a letter.
		//If the ID starts with a letter, it returns true.
		//Otherwise, the method returns false.
		if (!Character.isLetter(id.charAt(0))) { System.out.println("ID must start with a letter."); }
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
	
	public static boolean checkSpecialCharacter(String id) {
		for (int i = 0; i < id.length(); i++) {
			
			if (!Character.isDigit(id.charAt(i)) && !Character.isLetter(id.charAt(i))) {
				return true;
			}
		}
		return false;
		
	}

}
