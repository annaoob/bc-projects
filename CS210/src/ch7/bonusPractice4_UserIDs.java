/* 
 * CS210 Assignment 03 (User IDs)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.02.17 - Winter Quarter
 *
 * This program reads out current user IDs and asks user to create new ID.
 * The program adds the new ID to the file with IDs.
 * Next time the program runs, the new ID will be read out with all the current IDs.
 */

package ch7;

import java.io.*;
import java.util.*;

public class bonusPractice4_UserIDs {

	public static void main(String[] args) throws FileNotFoundException {
		//sets up a way to ask for user input and a way to read the IDs files
		Scanner input = new Scanner (System.in);
		Scanner text = new Scanner (new File ("IDs.txt"));
		
		//sets up an ArrayList with all of the IDs
		ArrayList<String> IDs = new ArrayList<>();
		
		//while the IDs files has more IDs, the ArrayList adds all of them
		while (text.hasNext()){
		    IDs.add(text.next());
		}
		
		System.out.println("List of User IDs (" + IDs.size() + ")");
		
		//the program prints out all of the IDs in the ArrayList
		for (int i = 0; i < IDs.size(); i++){
			   System.out.println(IDs.get(i));
		}
		
		//asks user for new ID and adds it to ArrayList
		System.out.print("\nCreate new ID: ");
		String id = input.next();
		System.out.println("ID " + id + " created successfully! \n");
		IDs.add(id);
		
		System.out.println("List of User IDs (" + IDs.size() + ")");
		
		//prints out all the IDs in the Array List
		for (int i = 0; i < IDs.size(); i++){
			   System.out.println(IDs.get(i));
		}
		
		//sets up a way to add IDs to the IDs file
		PrintStream out = new PrintStream("IDs.txt");
		
		//adds all the IDs in the ArrayList to the IDs file, including the new ID
		for (int i = 0; i < IDs.size(); i++){
			   out.println(IDs.get(i));
		}
		
		//closes the out and input
		//no more way to get input or to add IDs to the the IDs file
		out.close();
		input.close();
	}
}
