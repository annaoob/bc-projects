/* 
 * CS210 Assignment 02 (Area Comparisons)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.01.25 - Winter Quarter
 *
 * This program calculates the area of two shapes based on user input
 * The program has the code for BONUS POINTS
 * The code for BONUS POINTS is in the getShape2() method
 */

package ch4;

import java.util.*;

public class assg02_area {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int shape1 = getShape1(input);
		double area1 = getArea(shape1, input);
		int shape2 = getShape2(shape1, input);
		double area2 = getArea(shape2, input);
		String shapeName1 = getShapeName(shape1);
		String shapeName2 = getShapeName(shape2);
		summary(shapeName1, shapeName2, area1, area2);
		input.close();
	}
	
	public static int getShape1 (Scanner input) {
		//This method determines what number (1, 2, or 3) the user entered for the first shape
		System.out.print("What shape's area do you want to calculate?\n1) Rectangle, 2) Triangle, 3) Circle: ");
		int shape1 = input.nextInt();
		//This while loop checks to see if the user selected 1, 2, or 3
		//While the user selects anything other than 1, 2, or 2 the program will ask the user to input 1, 2, or 3
		while (shape1 != 1 && shape1 != 2 && shape1 != 3) {
			System.out.print("Bad input. Enter 1, 2, or 3: ");
			shape1 = input.nextInt();
		}
		return shape1;
	}
	
	public static int getShape2 (int shape1, Scanner input) {
		//This method determines what number (1, 2, or 3) the user entered for the second shape
		//This method also prevents the user from selecting the same number that they did for the first shape
		//This is the method that contains the code for the BONUS POINTS
		String possibleShapes = possibleShapes(shape1);
		//possibleShapes is a string that contains the shapes that the user hasn't selected for the first shape
		//This string is determined via the method possibleShapes
		System.out.print("What shape's area do you want to calculate?\n"+ possibleShapes + ": ");
		int shape2 = input.nextInt();
		//This while loop checks to see if the user selected 1, 2, or 3 or the same number for the second and first shapes
		//While the user selects anything other than 1, 2, or 2 the program will ask the user to input 1, 2, or 3
		//While the user keeps selecting the same number for shape2 as they did for shape1, the program will ask them to enter a different number
		while (shape2 != 1 && shape2 != 2 && shape2 != 3 || shape2 == shape1) {
			if (shape1==shape2) {
				System.out.print("The first shape cannot be the same as your second shape. Enter another shape: ");
				shape2 = input.nextInt();
			} else {
				System.out.print("Bad input. Enter 1, 2, or 3: ");
				shape2 = input.nextInt();
			}
		}
		return shape2;
	}
	
	public static String possibleShapes(int shape) {
		//This method creates a string with shapes that the user hasn't selected for the first shape
		//It does this based on the number that was selected for the first shape
		String possibleShapes = "1) Rectangle, 2) Circle, 3) Triangle";
		if (shape == 1) {possibleShapes = "2) Triangle, 3) Circle";}
		else if (shape == 2) {possibleShapes = "1) Rectangle, 3) Circle";}
		else {possibleShapes = "1) Rectangle, 2) Triangle";}
		return possibleShapes;
	}
	
	public static double getArea(int shape, Scanner input) {
		//This method finds the area the given shape based on if the shape was 1) Rectangle 2) Circle or 3) Triangle
		//When it knows the shape, the method activates one of three methods that calculates area. One for rectangle, one for circle, and one for triangle
		double area = 0.0;
		if (shape == 1) {area = rect(input);}
		else if (shape == 2) {area = triangle(input);}
		else {area = circle(input);}
		return area;
	}
	
	public static String getShapeName(int shape) {
		//This method finds the name of the given shape
		//It returns a string with that shape's name
		String shapeName = null;
		if (shape == 1) {shapeName = "Rectangle";}
		else if (shape == 2) {shapeName = "Triangle";}
		else {shapeName = "Circle";}
		return shapeName;
	}
	
	public static double rect(Scanner input) {
		//This method finds the area of a rectangle
		//If the shape is a rectangle, the method getArea() will use this method to find the area of the shape
		System.out.print("Input rectangle width:  ");
		double width = input.nextDouble();
		System.out.print("Input rectangle height: ");
		double height = input.nextDouble();
		System.out.println();
		double area = width * height;
		return area;
	}
	
	public static double triangle(Scanner input) {
		//This method finds the area of a triangle
		//If the shape is a triangle, the method getArea() will use this method to find the area of the shape
		System.out.print("Input triangle height: ");
		double height = input.nextDouble();
		System.out.print("Input triangle base:   ");
		double base = input.nextDouble();
		System.out.println();
		double area = (height * base) / 2;
		return area;
	}
	
	public static double circle(Scanner input) {
		//This method finds the area of a circle
		//If the shape is a circle, the method getArea() will use this method to find the area of the shape
		System.out.print("Input circle radius: ");
		double radius = input.nextDouble();
		System.out.println();
		double area = Math.PI * radius * radius;
		return area;
	}
	
	public static void summary(String shape1, String shape2, double area1, double area2) {
		//This method prints the shape areas and the summary statement
		double max = Math.max(area1, area2);
		double min = Math.min(area1, area2);
		double times = max/min;
		System.out.printf("%-16s%.2f \n", shape1 + " area: ", area1);
		System.out.printf("%-16s%.2f \n", shape2 + " area: ", area2);
		if (area1>area2) {System.out.printf("The area of the " + shape1.toLowerCase() + " seems %.2f times bigger than the area of the " + shape2.toLowerCase(), times);
		} else if (area1<area2) {System.out.printf("The area of the " + shape2.toLowerCase() + " seems %.2f times bigger than the area of the " + shape1.toLowerCase(), times);
		} else {System.out.println("The area of the " + shape1.toLowerCase() + " is equal to the area of the " + shape2.toLowerCase());
		}
	}
	
}
