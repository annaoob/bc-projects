package ch5;

import java.util.*;

public class midtermPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int number1;
		int number2;
		do {
			System.out.println("input first number: ");
			number1 = input.nextInt();
			System.out.println("input second number: ");
			number2 = input.nextInt();
			System.out.println();
			if (number1 < 0 || number1>=number2) {
				System.out.println("Error. Input again");
			}
		} while (number1 < 0 || number1>=number2);
		
		Random rand = new Random();
		int a = rand.nextInt(number2-number1+1) + number1;
		int b = rand.nextInt(number2-number1+1) + number1;
		
		String op = null;
		do {
			System.out.println("Choose a sign: + or -");
			op = input.next();
			System.out.println();
			if (!op.equals("+") && !op.equals("-")) {
				System.out.println("Error. Input again. ");
			}
		} while(!op.equals("+") && !op.equals("-"));
		
		int ans = answer(a, b, op);
		int count = 0;
		boolean proceed = true;
		
		while (proceed) {
			System.out.println(a + op + b + " = ? " );
			int userA = input.nextInt();
			if (userA == ans) {
				System.out.println("You are a math genius! Bye.");
				proceed = false;
			}
			else if (count==2 && userA!=ans) {
				System.out.println("You are a math fool! Bye.");
				proceed = false;
			} else {
				System.out.println("wrong answer!\n");
			}
			count++;
		}
		input.close();
	}
	
	public static int answer(int a, int b, String op) {
		int result = 0;
		if (op.equals("+")) {result = a+b;}
		else {result = a-b;}
		return result;
	}

}
