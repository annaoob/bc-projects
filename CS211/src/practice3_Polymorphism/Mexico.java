/* 
 * CS210 Practice 3 (Polymorphisms)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.04.13 - Spring Quarter
 *
 * This is the Mexico class. It is the subclass of the Burger class.
 * It prints out the price and the toppings of a Mexican burger.
 */

package practice3_Polymorphism;

public class Mexico extends Burger{

	private static double EXCHANGE_RATE = 18.05;
	private static String MEXICAN_TOPPING = ", taco sauce ";
	
	@Override
	public double price() {
		return super.price() * EXCHANGE_RATE;
	}
	
	@Override
	public String toppings() {
		return super.toppings() + MEXICAN_TOPPING;
	}
	
	public void menu() {
		System.out.printf("Price: %.2f\tToppings: %s\n", price(), toppings());
	}
	
}
