/* 
 * CS210 Practice 2 (Inheritance 2 - Efficient)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.04.11 - Winter Quarter
 *
 * This is the Inefficient_Passenger class. It is the superclass of the Ineffcient_Student class.
 * It creates the  variables fare and color for a regular passenger
 * and prints out the fare and color of the ticket of a regular passenger.
 */

package Practice2_Inhertiance2_Inefficient;

public class Inefficient_Passenger {

	//the variables fare and color are declared to be 3.0 and "red", respectively
	//this is inefficient because now the fare and the color are visible, 
	//which endangers the privacy of the passengers
	public double fare = 3.0;
	public String color = "red";
	
	//this is inefficient because this removes a class that would be specific to adults
	//it equates a regular passenger to an adult, which might not be true always
	//for example, adults specifically might start to get a discount, and then they stop being regular passengers
	public void ticket() {
		System.out.printf("Fare: %.1f\tColor: %s\n", fare, color);
	}
}
