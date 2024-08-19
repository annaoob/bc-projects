/* 
 * CS211 Practice 11 (Stack Operations 2)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.05.18 - Spring Quarter
 *
 * This program calls upon the class PostflixEvaluation to evaluate a given postfix expression.
 */

package practice11_Infix2Postfix;

import java.util.*;

public class MyExpression {

	static Scanner input = new Scanner(System.in);
	static String infix;
	static String postfix;
	
	public static void main(String[] args) {
		
		/*while (true) {
			System.out.println();
			System.out.println("Enter an infix expression");
			infix = input.nextLine();
			if (infix.length()==0) {
				System.out.println("Bye..");
				break;
			}
					
			else {
				InfixToPostfix i2p = new InfixToPostfix();
				postfix = i2p.infix2postfix(infix);
				System.out.println("infix: " + infix );
				System.out.println("postfix: " + postfix );
			}
		}*/
		
		//ask user to give a postfix expression to evaluate
		
		//System.out.print("Please enter a postfix expression to evaluate: ");
		//String expression = input.nextLine();
		
		//create a new object of the class PostflixEaluation
		
		//PostfixEvaluation p = new PostfixEvaluation();
		
		//print out the integer value in object p when the method postflixEvaluation() 
		//is performed with the user given expression
		
		//System.out.println(p.postfixEvaluation(expression));
		
		System.out.print("Please enter a math expression: ");
		String expression = input.nextLine();
		InfixToPostfix post = new InfixToPostfix();
		
		System.out.println(post.infix2postfix(expression));

	}

}
