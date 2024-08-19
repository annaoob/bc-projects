/* 
 * CS210 Practice 8 (While Loop)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.02.01 - Winter Quarter
 *
 * This program asks generates two random numbers between 2 and 10,
 * asks the user for an operator, and asks the user to answer a math question
 * with the two random numbers and the given operator.
 * If the user is correct, the program prints "You are a math genius!! Bye."
 * If the user is wrong, the program print "wrong answer!" 
 * and asks the user to answer the question again
 */

package ch5;

import java.util.*;

public class practice10_randomnumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		Random rand = new Random();
		int num1 = rand.nextInt(9) + 2;
		int num2 = rand.nextInt(9) + 2;
		System.out.println("Which operation? +, -, *, or /");
		String sign = input.next();
		int result = result(num1, num2, sign);
		System.out.println(num1 + sign + num2 + " = ? ");
		int userA = input.nextInt();
		
		while (userA != result) {
			System.out.println("wrong answer!");
			System.out.println(num1 + sign + num2 + " = ? ");
			userA = input.nextInt();
		}
		System.out.println("You are a math genius! Bye. ");
		input.close();
	}
	
	public static int result(int num1, int num2, String sign) {
		int result = 0;
		if (sign.equals("+")) {result = num1 + num2;}
		else if (sign.equals("-")) {result = num1 - num2;}
		else if (sign.equals("*")) {result = num1 * num2;}
		else if (sign.equals("/")) {result = num1 / num2;}
		else {
			System.out.println("Bad operator. Infinte loop will happen.");
		}
		return result;
	}

}
