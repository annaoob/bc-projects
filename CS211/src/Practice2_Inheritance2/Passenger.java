/* 
 * CS210 Practice 2 (Inheritance 2 - Efficient)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.04.11 - Winter Quarter
 *
 * This is the Passenger class. It is the superclass of the Student and Adult classes.
 * It creates the private variables fare and color which it can, through methods,
 * return the fare and the color to its subclasses
 */

package Practice2_Inheritance2;

public class Passenger {
	
	//creates private string variable color and sets it to be the regular color, red
	//this is efficient because the regular color is red
	private String color = "red";
	
	//creates private double variable fare and sets it to be the regular fare, 3.0
	//this is efficient because the regular fare is 3.0
	private double fare = 3.0;
	
	//method that returns the fare to the subclass of this superclass
	//this is efficient because the subclasses depend on the fare of this class
	public double fare() {
		return this.fare;
	}
	
	//method that returns the color to the subclass of this superclass
	//this is efficient because some of the subclasses depend on the color of this class
	public String color() {
		return this.color;
	}
}
