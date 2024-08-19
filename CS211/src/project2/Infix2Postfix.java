/* 
 * CS211 Project 2 (Stack Operations - Expression Evaluation)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.05.29 - Spring Quarter
 *
 * This class converts a given infix expression to a postfix expression.
 */

package project2;

import java.util.*;

public class Infix2Postfix {

	//create static String post and HashMap precedence
	public static String post = "";
	public static HashMap<Character, Integer> precedence = new HashMap<>();
	
	public String infix2postfix(String infix) {
		
		loadPrecedence();
		
		//create a stack of operators and a lastNumberIsDigit variable
		Stack<Character> stack = new Stack<Character>();
		post = "";
		boolean lastCharIsDigit = false;
		
		//while there are characters in the infix parameter, do the for loop
		for (int j = 0; j < infix.length(); j++) {
			
			//char c is a character of the infix String with an index of j
			char c = infix.charAt(j);
			
			//if the character is a digit, add the digit to the String post and set lastCharIsDigit to true
			if (c >= '0' && c <= '9') {
				post += String.valueOf(c);
				lastCharIsDigit = true;
			} 
			
			//else if the current character is not a digit and the last character is a digit,
			//add a space to the String post and set lasCharIsDigit to false
			else if (lastCharIsDigit) {
				post += " ";
				lastCharIsDigit = false;
			}
			
			//if the current and last character is a number, add a space to the String post
			if (c >= '0' && c <= '9' && j == infix.length()-1) {
				post += " ";
			}
			
			//if the current character is an opening parenthesis, push the character into the stack
			if(c == '(' || c == '{') {
				stack.push(c);
			}
			
			//if the character is ), run through the stack until you see (, adding the popped characters to the String post
			if (c == ')') {
				char p = ' ';
				while (stack.peek() != '(') {
					p = stack.pop();
					post += p + " ";
				}
				p = stack.pop();
			}
			
			//if the character is }, run through the stack until you see {, adding the popped characters to the String post
			if (c == '}') {
				char p=' ';
				while (stack.peek() != '{'){
					p = stack.pop();
					post += p + " ";
				}
				p = stack.pop();
			}
			
			//if the character is an operator, add operators of higher precedence to the String post and push the character into the stack
			if (c == '+' || c == '-' || c == '*' || c == '/') {
				while (!stack.isEmpty() && (precedence.get(stack.peek()) >= precedence.get(c))) {
					char p = stack.pop();
					post += p + " ";
				}
				stack.push(c);
			} 
		}
		
		//after the for loop is complete, add all the remaining operands in the stack to the String post
		while (!stack.isEmpty()) {	
			char p = stack.pop();
			post += p;
		}
		
		return post;
		
	}
	
	//adds the different operators and parentheses to the precedence HashMap as keys and their order of precedence as values
	public static void loadPrecedence(){
		precedence.put('(', 0);
		precedence.put('{', 0);
		precedence.put('+', 1);
		precedence.put('-', 1);
		precedence.put('*', 2);
		precedence.put('/', 2);
	}
	
}
