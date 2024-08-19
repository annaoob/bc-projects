/* 
 * CS210 Practice 2 (Inheritance 2 - Inefficient)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.04.11 - Winter Quarter
 *
 * This is the Inefficient_Student class.
 * It is the subclass of the Inefficient_Passenger class
 * It prints out the fare and the color of a student ticket
 */

package Practice2_Inhertiance2_Inefficient;

public class Inefficient_Student extends Inefficient_Passenger {
	
	//the variables fare and color are declared to be 1.5 and "grey", respectively
	//this is inefficient because now the student fare is a constant
	//if the discount of the regular fare changes, the student fare won't change
	public double fare = 1.5;
	public String color = "grey";
	
	//this method prints out the ticket specific to a student
	//it is inefficient because it relies on constant variables rather that methods that can change
	//if the values the methods are using change
	public void ticket() {
		System.out.printf("Fare: %.1f\tColor: %s\n", fare, color);
	}

}
