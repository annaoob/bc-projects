/* 
 * CS210 Practice 6 - If Statement
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.01.24 - Winter Quarter
 *
 * This program calculates the area of a rectangle and a circle
 * based on user input
 */

package ch2;

import java.util.*;

public class practice6_ifstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Input rectangle width: ");
		double width = input.nextDouble();
		System.out.println("Input rectangle height: ");
		double height = input.nextDouble();
		System.out.println("Input circle radius: ");
		double radius = input.nextDouble();
		System.out.println();
		input.close();
		
		double rect = recArea(width, height);
		double circle = circleArea(radius);
		
		System.out.println("Rectangle area: " + rect);
		System.out.printf("Circle area: %.2f \n", circle);
		System.out.println();
		
		if (rect>circle) {
			System.out.println("The area of the rectangle seems "
					+ (rect/circle) + " times bigger than the "
							+ "area of the circle");
		} else if (circle>rect) {
			System.out.println("The area of the circle seems "
					+ (circle/rect) + " times bigger than the "
							+ "area of the rectangle");
		} else {System.out.println("The area of the rectangle "
				+ "is equal to the area of the circle");}
		
	}
	
	public static double recArea(double w, double h) {
		double area = w * h;
		return area;
	}
	
	public static double circleArea(double r) {
		double area = 3.1415 * r * r;
		return area;
	}

}
