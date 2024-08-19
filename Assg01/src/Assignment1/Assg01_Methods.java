/* 
 * CS210 Assignment 01 (Methods - Sequence)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.01.09 - Winter Quarter
 *
 * This program is a short puzzle.
 */

package Assignment1;

public class Assg01_Methods {
	public static void first() {
        System.out.println("first method");
        third();
        second();
        
    }
    public static void second() {
        System.out.println("second method");
        
        
    }
 
    public static void third() {
        System.out.println("third method");
        second();
        
    } 
 
    public static void main(String[] args) {
    // DO NOT change this main method
       first();
       third();
       second();
       third();
    // DO NOT change this main method
    }
}
// Desired output:
// first method
// third method
// second method
// second method
// third method
// second method
// second method
// third method
// second method

