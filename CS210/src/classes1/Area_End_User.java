/* 
 * CS210 Practice 14 (Classes - End user class)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.02.23 - Winter Quarter
 *
 * This program calculates the area of either a triangle or a circle
 * Uses the class Area to do so
 */

package classes1;

import java.util.*;

public class Area_End_User {

	public static void main(String[] args) {
		//sets up a way to accept input from user
		Scanner input = new Scanner (System.in);
		
		//declares variable shapeNum and sets it equal to 0
		int shapeNum = 0;
		
		//the program asks the user to define a shape
		do {
			System.out.print("Define a shape 1) triangle, 2) circle: ");
			shapeNum = input.nextInt();
		//the program does this while the shape inputed is not 1 or 2
		} while (shapeNum != 1 && shapeNum != 2);
		
		//creates an object  (instance) of the user-defined Area class
		Area myObject = new Area();
		
		//creates the variables area and shape
		double area = 0.0;
		String shape = null;
		
		//if the user entered 1, the program asks for a base and a height
		if (shapeNum == 1) {
			System.out.print("Triangle Base: ");
			double base = input.nextDouble();
			System.out.print("Triangle Height: ");
			double height = input.nextDouble();
			//the area is calculated according to the triangleArea method of the Area class
			area = myObject.triangleArea(base, height);
			
			//the shape is a triangle
			shape = "Triangle";
		}
		//otherwise, the program asks for a radius
		else {
			System.out.println("Circle radius: ");
			double radius = input.nextDouble();
			//the area is calculated according to the circleArea method of the Area class
			area = myObject.circleArea(radius);
			//the shape is a circle
			shape = "Circle";
		}
		
		//the program prints the shape's area
		System.out.printf("\n" + shape + " area: %.2f", area);
		
		//closes the input
		//no more way to ask for user input
		input.close();
	}

}
