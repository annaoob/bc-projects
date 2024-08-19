/* 
 * CS211 Bonus Practice 3 (BigData + Inheritance)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.04.28 - Spring Quarter
 *
 * This program prints the exchange rate of USD to Euros, the temperature in Berlin,
 * and the price of a burger in Berlin
 */

package bounsPractice3;

public class Bonus3_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Germany Berlin = new Germany("Berlin");
		
		System.out.println("Germany (" + Berlin.franchise + ")");
		System.out.println("Excahnge Rate (US to Euros) = " + Berlin.getRate());
		
		//temperature is in Celsius
		Temperature t = new Temperature();
		System.out.println("Temperature = " + t.getTemp());
		
		System.out.println("Burger Price = " + Berlin.price());
	}

}
