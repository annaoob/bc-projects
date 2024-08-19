/* 
 * CS210 Practice 8 (While Loop)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.01.30 - Winter Quarter
 *
 * This program asks user for 3 numbers and 
 * prints you "you are genius! Bye!" 
 * if the 1st and 2nd integers are not the same
 * AND if (1st num + 2nd num) < 2rd num.
 * Otherwise, the program asks to input again
 */

package ch5;

import java.util.*;

public class practice8_whileloop {

	public static void main(String[] args) {
		boolean stop = false;
		while (stop == false) {
			Scanner input = new Scanner (System.in);
			System.out.println("input first number: ");
			int num1 = input.nextInt();
			System.out.println("input second number: ");
			int num2 = input.nextInt();
			System.out.println("input third number: ");
			int num3 = input.nextInt();
			
			if ((num1 + num2) < num3 && num1 != num2) {
				System.out.println("you are a genius! Bye!");
				input.close();
				stop = true;
			}
			else {System.out.println("input again! \n");}
		}
	}

}
