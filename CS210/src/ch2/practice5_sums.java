/* 
 * CS210 Practice 5 (Sums)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.01.20 - Winter Quarter
 *
 * This program calculates the sum of the consecutive
 * integers between any two given numbers
 */

package ch2;

import java.util.Scanner;

public class practice5_sums {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Input 1st number: ");
		int num1 = input.nextInt();
		System.out.println("Input 2nd number: ");
		int num2= input.nextInt();
		System.out.println();
		int min = Math.min (num1, num2);
		int max = Math.max(num1, num2);
		int sum = sum(min, max);
		System.out.println("sum = " + sum);
		input.close();
	}

	public static int sum(int min, int max) {
		int total = 0;
		for (int i=min; i<=max; i++) {
			total += i;
		}
		return total;
	}
}
