/* 
 * CS211 Project 1 (New Random Class)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.04.17 - Spring Quarter
 *
 * This is the NewRandomTest. It tests the NewRandom class
 */

package project1_NewRandomClass;

public class NewRandomTest {

	public static void main(String[] args) {
		
		//create new object rnd of the class NewRandom
		NewRandom rnd = new NewRandom();
		
		//each example data is tested 40 times
		int test = 40;
		
		System.out.println("\nMethod 1: nextInt(5, 9)");
		//while the method wasn't tested 40 times,
		for(int i = 0; i < test; i++) {
			//program generates and prints a random integer between 5 and 9, including 5 and 9
			int a = rnd.nextInt(5, 9);
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.println("\nMethod 2: nextChar()");
		//while the method wasn't tested 40 times,
		for(int i = 0; i < test; i++) {
			//program generates and prints a random character
			char a = rnd.nextChar();
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.println("\nMethod 3-1: nextChar(c, f)");
		//while the method wasn't tested 40 times,
		for(int i = 0; i < test; i++) {
			//program generates and prints a random character between 'c' and 'f'
			char a = rnd.nextChar('c', 'f');
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.println("\nMethod 3-2: nextChar(x, c)");
		//while the method wasn't tested 40 times,
		for(int i = 0; i < test; i++) {
			//program generates and prints a random character between 'x' and 'c'
			char a = rnd.nextChar('x', 'c');
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.println("\nMethod 4-1: nextCharExcept(c)");
		//while the method wasn't tested 40 times,
		for(int i = 0; i < test; i++) {
			//program generates and prints a random character that is not 'c'
			char a = rnd.nextCharExcept('c');
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.println("\nMethod 4-2: nextCharExcept(z)");
		//while the method wasn't tested 40 times,
		for(int i = 0; i < test; i++) {
			//program generates and prints a random character that is not 'z'
			char a = rnd.nextCharExcept('z');
			System.out.print(a + " ");
		}
		System.out.println();

	}

}
