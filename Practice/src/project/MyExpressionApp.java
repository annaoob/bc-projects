package project;

import java.util.Scanner;

public class MyExpressionApp {

	//create variables mathExpression and valid, and set up a way to read the user's input
		static String mathExpression;
		static boolean valid = true;
		static Scanner input = new Scanner(System.in);
		static int x;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//do this loop until broken out of it
		while(true) {
					
			//ask user to input a math expression and set mathExpression to be the user's input
			System.out.print("Enter a math expression: ");
			
			mathExpression = input.nextLine();
			
			System.out.print("What is the variable equal to? ");
			
			x = Integer.valueOf(input.nextLine());
					
			//if the user entered an empty math expression, print "Bye!" and break out of the while loop, terminating the program
			if (mathExpression.length() == 0) {
				System.out.println("Bye!");
				break;
			}
				
			//else use the class ExpressionEvaluation to see if the entered math expression is correct
			else {
				ExpressionEvaluation ee = new ExpressionEvaluation();
				valid = ee.expressionEvaluation(mathExpression);					
				
				//if it is a correct math expression, convert it to postfix using Infix2Postfix class
				//and evaluate it using PostfixEvalaution class
				if (valid) {
						
					Infix2Postfix i2p = new Infix2Postfix();
					String postfix = i2p.infix2postfix(mathExpression);
					
					PostfixEvaluation pe = new PostfixEvaluation();
					double result = pe.postfixEvaluation(postfix, x);
							
					//print the entered math expression in infix form, postfix form, and the result
					System.out.println("infix: " + mathExpression);
					System.out.println("postfix: " + postfix);
					System.out.println("result: " + result);
							
				} //end if valid
						
			} //end else
					
			System.out.println();
					
		} //end while
		
	} //end main

}
