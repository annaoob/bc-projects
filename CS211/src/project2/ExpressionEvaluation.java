/* 
 * CS211 Project 2 (Stack Operations - Expression Evaluation)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.05.29 - Spring Quarter
 *
 * This class figures out if a given expression is accurate.
 */

package project2;

import java.util.*;

public class ExpressionEvaluation {
	
	//set up static HashMaps errorMessage and pair
	static HashMap<Integer, String> errorMessage = new HashMap<>();
	static HashMap<Character, Character> pair = new HashMap<>();
	
	//return true or false depending on if the given parameter statement is accurate
	public boolean expressionEvaluation(String statement) {
		
		loadErrorMessage();
		loadPair();
		
		//create a stack of characters and a boolean valid
		Stack<Character> stack = new Stack<>();
		
		boolean valid = true;
		
		//do the for loop while there are characters in the statement
		for (int j = 0; j < statement.length(); j++) {
			
			//create a character c that has an index of j in the statement
			char c = statement.charAt(j);
			
			//if the character is an opening parenthesis, push it into the stack of characters
			if ((c == '{') || (c == '(')) {
				stack.push(c);
			}
			
			//if it is a closing circular parenthesis, check is the stack is empty
			if (c == ')') {
				
				//if the stack is empty, print error message number 3, set valid to false, and break out of the for loop
				if (stack.isEmpty()) {
					printError(statement, j, 3);
					valid = false;
					break;
				}
				
				//if the stack is not empty, pop a character from the stack of characters
				else {
					
					char PoppedChar = stack.pop();
					
					//if the popped character is not a pair to the closing circular parenthesis, print error message number 1,
					//set valid to false, and break out of the for loop
					if (!(PoppedChar == pair.get(c))) {
						printError(statement, j, 1);
						valid = false;
						break;
					}
				}
			}
			
			//if it is a closing squiggly parenthesis, check is the stack is empty
			else if (c == '}') {
				
				//if the stack is empty, print error message number 3, set valid to false, and break out of the for loop
				if (stack.isEmpty()) {
					printError(statement, j, 3);
					valid = false;
					break;
				}
				
				//if the stack is not empty, pop a character from the stack of characters
				else {
					
					char PoppedChar = stack.pop();
					
					//if the popped character is not a pair to the closing circular parenthesis, print error message number 1,
					//set valid to false, and break out of the for loop
					if (!(PoppedChar == pair.get(c))) {
						printError(statement, j, 2);
						valid = false;
						break;
					} //end if (!(PoppedChar == pair.get(c)))
				} //end else
			} //end else if (c == '}')
		} //end for loop
		
		//if valid is true and the stack is not empty print error message number 3 and set valid to false
		if (valid && !stack.isEmpty()) {
			printError(statement, statement.length()-1, 3);
			valid = false;
		}
		
		return valid;
		
	}
	
	//put pairs of parentheses into the pair HashMap
	public static void loadPair() {
		pair.put('}', '{');
		pair.put(')', '(');
	}
	
	//print an error message with a pointer indicating where the first caught error is
	public static void printError(String statement, int location, int errorNo) {
		System.out.println(statement);
		
		for (int i = 0; i < location; i++) {
			System.out.print(" ");
		}
		
		System.out.print("^ ");
		System.out.println(errorMessage.get(errorNo));
		
	}
	
	//put error messages as values and error numbers as keys into the errorMessage HashMap
	public static void loadErrorMessage() {
		errorMessage.put(1, "} expected");
		errorMessage.put(2, ") expected");
		errorMessage.put(3,  "Incomplete Expression");
	}

}
