/* 
 * CS210 Practice 3 (Polymorphisms)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.04.13 - Spring Quarter
 *
 * This is the Burger class. It is the superclass of the USA and Mexico classes.
 * It creates the private variables price and toppings which it can, through methods,
 * return the price and the toppings to its subclasses
 */

package practice3_Polymorphism;

public class Burger {
	
	private double price = 3.0;
	private String toppings = "beef patty, tomato, onion, ranch source";
	
	public double price() {
		return this.price;
	}
	
	public String toppings() {
		return this.toppings;
	}

}
