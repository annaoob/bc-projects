/* 
 * CS211 Practice 11 (Stack Operations 2)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.05.18 - Spring Quarter
 *
 * This program evaluates a given postfix expression in the parameter in the method postflixEvaluation().
 */

package practice11_Infix2Postfix;

import java.util.*;

public class PostfixEvaluation {
	
	public int postfixEvaluation(String postfix) {
		
		//create a stack of integer values in the postfix expression
		Stack<Integer> stack = new Stack<Integer>();
		String number = "";
				
		//While there are still characters in the postfix expression, do the following
		for (int j=0; j<postfix.length(); j++) {
					
			//set character c equal to the character at some index of the postfix expression
			char c = postfix.charAt(j);
			//System.out.println("." + c + ".");
					
			//if the character is a digit, push the number into the stack
			if (Character.isWhitespace(c)) {
				if (!number.equals("")) {stack.push(Integer.parseInt(number)); }
				number = "";
			}
					
			if (c>='0' && c<='9') {
				number+=String.valueOf(c);
				//System.out.println(number);
				//stack.push(Character.getNumericValue(c));
			}
					
			//if character c is an operation, pop out 2 operands and create a variable result
			if (c == '+' || c == '-' || c == '*' || c == '/') {
						
				//for the two operands, operand2 came before operand1 in the postfix expression
				//so operand2 comes before operand1 in the following evaluations
				int operand1 = stack.pop();
				int operand2 = stack.pop();
				int result = 0;
							
				//if character c is plus, perform addition on the two operands, 
				//and set result equal to the sum
				if (c == '+') {
					result = operand2 + operand1; 
				}
							
				//if character c is minus, perform subtraction on the two operands,
				//and set result equal to the difference
				else if (c == '-') {
					result = operand2 - operand1; 
				}
							
				//if character c is the times sign, perform multiplication on the two operands,
				//and set result equal to the product
				else if (c == '*') {
					result = operand2 * operand1; 
				}
							
				//if character c is the division sign, perform division on the two operands,
				//and set result equal to the quotient
				else if (c == '/') {
					result = operand2 / operand1; 
				}
							
				//push the newly gotten result into the stack to be an operand if more evaluations follow
				stack.push(result);
						
			} 
		}
				
		//when the postfix expression has been fully read and evaluated, 
		//the final answer was placed back into the stack
		int answer = stack.pop();
				
		//if the stack is not empty after taking out the answer, then the postfix expression is inaccurate
		if (!stack.isEmpty()) {
			System.out.println("Operation not valid.");
		}
				
		//return the answer to the postfix evaluation
		return answer;
	}
}
