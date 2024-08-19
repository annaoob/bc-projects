/* 
 * CS210 Practice 2 (Inheritance 2 - Efficient)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.04.11 - Winter Quarter
 *
 * This is the Student class.
 * It is the subclass of the Passenger class
 * It prints out the fare and the color of a student ticket
 */

package Practice2_Inheritance2;

public class Student extends Passenger{
	
	//prevention of magic values
	//this is efficient because it explains what the values mean
	//it is also efficient because if the value the variables are equal to change,
	//the value will change everywhere where that value is present without having to manually change it everywhere
	private static double STUDENT_DISCOUNT = 0.5;
	private static String STUDENT_COLOR = "grey";
	
	//method that overrides the fare() method of the superclass
	//gets the fare of the superclass using super's fare() method
	//updates the fare() method of this class to return the fare in the super's class
	//multiplied by the student discount
	//this is efficient because if the fare in the superclass is changed, 
	//the discount will still be applied properly
	@Override
	public double fare() {
		return super.fare() * STUDENT_DISCOUNT;
	}
	
	//method that overrides the color() method of the superclass
	//gets the color of the superclass using super's color() method
	//updates the color() method of this class to return the student color
	//
	//unlike the fare() method, the color this method returns does not depend
	//on the color of the super.color() method
	
	
	//the reason why the code for this method looks like this is because the instructions state:
	//"One method is to get the color from the superclass and to update color. (apply @Override concept)"
	//the color from the superclass however, is not necessary, since the color returned by this class is 
	//independent of the color in the superclass
	
	//method that overrides the color() method of the superclass
	//unlike the fare() method, the color this method returns does not depend
	//on the color of the super.color() method, so it is not necessary to get the color from the super class
	@Override
	public String color() {
		
		return STUDENT_COLOR;
		
		//since the instructions state:
		//"One method is to get the color from the superclass and to update color. (apply @Override concept)"
		//Here are two options that would fulfill the "get the color from the superclass" requirement,
		//even though for this specific method it's not necessary because the color of this class does not depend
		//on the color of the superclass, unlike the fare
		
		//Option 1:
		//String color = super.color();
		//color = STUDENT_COLOR;
		//return color;
		
		//Option 2:
		//String color = super.color();
		//if (!super.color().equals(STUDENT_COLOR)) {
		//	color = STUDENT_COLOR;
		//}
		//return color;
	}
	
	//method that prints out the fare and the ticket of an adult passenger
	//this is efficient because it uses the two prior methods to print out the fare and color specific to a Student object
	public void ticket() {
		System.out.printf("Fare: %.1f\tColor: %s\n", fare(), color());
	}
	
}
