/* 
 * CS210 Practice 2 (Inheritance 2 - Efficient)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.04.11 - Winter Quarter
 *
 * This is the main class of this project.
 * It uses the Student, Passenger, and Adult classes to print out the fare and the color
 * of a student called Ed and an adult called Amy
 */

package Practice2_Inheritance2;

public class Efficient {

	public static void main(String[] args) {
		
		//creates object of the class Student called Ed
		Student Ed = new Student();
		//prints out the ticket of the Ed object of the class Student
		Ed.ticket();
		
		//creates object of the class Adult called Amy
		Adult Amy = new Adult();
		//prints out the ticket of the Amy object of the class Adult
		Amy.ticket();

	}

}
