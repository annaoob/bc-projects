/* 
 * CS211 Project 1 (New Random Class)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.04.17 - Spring Quarter
 *
 * This is the NewRandom class. It is the subclass of the Random class.
 * It overloads the nextInt() method, adds and overloads a nextChar() method,
 * and adds a nextCharExcept() method.
 */

package project1_NewRandomClass;

import java.util.*;

public class NewRandom extends Random {

	private static final long serialVersionUID = -6845602331254304060L;

	public int nextInt(int low, int high) {	
		//this method generates a number between the parameters low and high, inclusive of low and high
		
		//uses the super.nextInt() method to return a number between low and high, including low and high
		return super.nextInt(high-low+1) + low;
	
	}
	
	public char nextChar() {
		//this method generates a character
		
		//declare an integer variable num that generates a number between 0 and 25, inclusive, 
		//using the nextInt(int low, int high) method of this class
		int num = nextInt(0, 25);
		
		//the integer value of character 'a' is added to num, 
		//the sum is converted back to a character and then returned
		return (char) ('a' + num);
	
	}
	
	public char nextChar(char from, char to) {
		//this method generates a random character between the parameters from and to
		
		//if from is less than to,
		if (from < to) {
			
			//the integer num will be randomly generated between 0 and difference of to-from
			int num = this.nextInt(0, (to-from));
			
			//the integer value of character "from" is added to num, 
			//the sum is converted back to a character and then returned
			return (char) (from + num);
		}
		
		//if from is greater that to,
		if (from > to) {
			
			//if a=1, b=2, c=3..., the lower bound is the value of from
			//the upper bound is the value of to + 26 (so that it is greater than lower bound)
			//num is the remainder of the random number divided by 26
			//it correlates with all the numerical values of the characters between "from" and z, and a and "to"
			int num = this.nextInt(from - 'a', to - 'a' + 26) % 26;
			
			//the integer value of character 'a' is added to num, 
			//the sum is converted back to a character and then returned
			return (char) ('a' + num);
		}
		
		//else, the parameters are the same character, and that character is returned
		else {return from; }
	}
	
	public char nextCharExcept(char c) {
		//this method generates a random character except the parameter character c
		
		//declare variable a of type char
		char a;
		
		//generate a random character for variable a while a is equal to the parameter c
		do {
			a = this.nextChar();
		} while (a == c);
		
		//return the randomly generated character that isn't c
		return a;
	}
}
