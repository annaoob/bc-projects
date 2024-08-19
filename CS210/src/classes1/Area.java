/* 
 * CS210 Practice 14 (Classes - User-defined class)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.02.23 - Winter Quarter
 *
 * This program has 2 methods to calculate the area of a circle or triangle
 */

package classes1;

public class Area {

	//calculates a circle's area using the parameter r (radius)
	public double circleArea (double r) {
		double result = Math.PI * r * r;
		return result;
	}
	
	//calculates the triagnle's are knowing the parameters b (base) and h (height)
	public double triangleArea (double b, double h) {
		double result = (b * h) / 2.0;
		return result;
	}
	
}
