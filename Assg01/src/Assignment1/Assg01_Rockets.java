/* 
 * CS210 Assignment 01 (Methods - Rockets)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.01.09 - Winter Quarter
 *
 * This program is 2 rockets.
 */

package Assignment1;

public class Assg01_Rockets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		top();
		body();
		wall();
		body();
		top();
	}
	
	public static void top() {
		System.out.println("   /|\\     \\  |  /");
		System.out.println("  / | \\     \\ | /");
		System.out.println(" /  |  \\     \\|/");
	}
	
	public static void body() {
		System.out.println("+-------+ +-------+");
		System.out.println("|       | |       |");
		System.out.println("|       | |       |");
		System.out.println("+-------+ +-------+");
	}
	
	public static void wall() {
		System.out.println("|  969  | |  696  |");
	}
}
