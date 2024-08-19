/* 
 * CS210 Practice 2 (Inheritance 2 - Efficient)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.04.11 - Winter Quarter
 *
 * This is the Adult class. It is the subclass of the Passenger class.
 * It prints out the fare and the color of an adult ticket
 */

package Practice2_Inheritance2;

public class Adult extends Passenger {
	
	//method that overrides the fare() method of the superclass
	//gets the fare of the superclass using super's fare() method
	//updates the fare() method of this class to return the fare in the super's class
	//this is efficient because it applies whatever the regular fare in the super class is to the Adult object
	//if the regular fare in the super class changes, then that fare will be applied to the Adult object
	@Override
	public double fare() {
		return super.fare();
	}
	
	//method that overrides the color() method of the superclass
	//gets the color of the superclass using super's color() method
	//updates the color() method of this class to return the color in the super's class
	//this is efficient because it applies whatever the regular color in the super class is to the Adult object
	//if the regular color in the super class changes, then that color will be applied to the Adult object
	@Override
	public String color() {
		return super.color();
	}
	
	//method that prints out the fare and the ticket of an adult passenger
	//this is efficient because it uses the two prior methods to print out the fare and color specific to an Adult object
	public void ticket() {
		System.out.printf("Fare: %.1f\tColor: %s\n", fare(), color());
	}

}
