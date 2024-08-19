/* 
 * CS210 Practice 3 (Polymorphisms)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.04.13 - Spring Quarter
 *
 * This is the USA class. It is the subclass of the Burger class.
 * It prints out the price and the toppings of a USA burger.
 */

package practice3_Polymorphism;

public class USA extends Burger{
	
	@Override
	public double price() {
		return super.price();
	}
	
	@Override
	public String toppings() {
		return super.toppings();
	}
	
	public void menu() {
		System.out.printf("Price: %.2f\tToppings: %s\n", price(), toppings());
	}

}
