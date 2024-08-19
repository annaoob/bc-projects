/* 
 * CS210 Practice 5 (Average)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.01.20 - Winter Quarter
 *
 * This program calculates the average of two numbers
 */

package ch2;

import java.util.Scanner;

public class practice5_average {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Input 1st number: ");
		int num1 = input.nextInt();
		System.out.println("Input 2nd number: ");
		int num2= input.nextInt();
		double avg = average(num1, num2);
		System.out.println("average = " + avg);
		input.close();

	}
	
	public static double average(int num1, int num2) {
		double avg = (double) (num1 + num2)/2;
		return avg;
	}

}
