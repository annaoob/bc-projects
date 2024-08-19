package ch5;

import java.util.*;

public class bonnusPractice3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Input id: ");
		String id = input.next();
		
		System.out.println();
		
		while (!checkLength(id) || !checkLetter(id) || !checkNumber(id)) {
			
			if (!checkLength(id)) {
				System.out.println("Bad input. ID must be 4 characters long. Please reenter id: ");
			}
			else if (!checkLetter(id)) {
				System.out.println("Bad input. ID must start with a letter. Please reenter id: ");
			}
			else {
				System.out.println("Bad input. ID must have at least one number like [0-9]. "
						+ "Please reenter id: ");
			}
			
			id = input.next();
			System.out.println();
		}
		
		System.out.println(id + " has been created");
		
		input.close();
	}

	public static boolean checkLength(String id) {
		
		return (id.length() == 4);
	}
	
	public static boolean checkLetter(String id) {
		
		return (Character.isLetter(id.charAt(0)));
	}
	
	public static boolean checkNumber(String id) {
		
		for (int i = 0; i < id.length(); i++) {
			
			if (Character.isDigit(id.charAt(i))) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	public static boolean checkNumber3 (String id) {
		return (Character.isDigit(id.charAt(0)) && Character.isDigit(id.charAt(1)) 
				&& Character.isDigit(id.charAt(2)) && Character.isDigit(id.charAt(3)));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean checkLetter1(char c) {
		
		boolean check = false;
		
		for (char i = 'a'; i <= 'z'; i++ ) {
			
			if (String.valueOf(i).equalsIgnoreCase(String.valueOf(c))) {
				return true;
			}
			
		}
		return check;
	}
	
	public static boolean checkNumber1(String id) {
		for (int i = 0; i < id.length(); i++) {
			if (id.charAt(i) >= '0' || id.charAt(i) < '9')
				return true;
		}
		return false;
	}
	
	
	
	
	
	public static boolean checkLetter2(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
	}
	
	public static boolean checkNumber2(String id) {
		for (int i = 0; i <= 9; i++ ) {
			if (id.contains(String.valueOf(i))) {
				return true;
			}
		}
		return false;
	}
}
