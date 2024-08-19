/* 
 * CS210 Practice 2 (Inheritance 2 - Inefficient)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.04.11 - Winter Quarter
 *
 * This is the main class of the inefficient program.
 * It prints out the fare and color of the student ticket for Ed
 * and the fare and color of the adult ticket for Amy
 */

package Practice2_Inhertiance2_Inefficient;

public class Inefficient {

	public static void main(String[] args) {
		
		Inefficient_Student Ed = new Inefficient_Student();
		Ed.ticket();
		
		Inefficient_Passenger Amy = new Inefficient_Passenger();
		Amy.ticket();
		
	}

}
