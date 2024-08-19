/* 
 * CS210 Practice 3 (Polymorphisms)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.04.11 - Spring Quarter
 *
 * This is the main class of this project.
 * It uses the Burger, USA, and Mexico classes to print out the price and the toppings
 * of a burger in Seattle and a burger in Cancun
 */

package practice3_Polymorphism;

public class Practice3_Main {

	public static void main(String[] args) {
		
		USA Seattle = new USA();
		Mexico Cancun = new Mexico();
		
		Seattle.menu();
		Cancun.menu();
	}

}
