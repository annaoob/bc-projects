/* 
 * CS211 Practice 4 (Arraylist & Object)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.04.18 - Spring Quarter
 *
 * This program reads the file score.txt, prints the names of students and their scores,
 * asks the user for a desired score and prints the names and scores of students
 * whose score is >= to the desired score
 */

package practice4_ArraylistAndObject;

import java.util.*;
import java.io.*;

public class Practice4 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//sets up an ArrayList students of Person objects
		ArrayList<Person> students = new ArrayList<>();
		
		//Sets up a way to ask for user input and a way to read the IDs files
		Scanner console = new Scanner (new File ("score.txt"));
		Scanner input = new Scanner (System.in);
		
		//while the file has something to read, a new Person object p is created
		while (console.hasNext()){
			Person p = new Person();
					
			//the object p consists of a string name and an integer score
			p.name = console.next();
			p.score = console.nextInt();
					
			//when the object p has a string name and an integer score, 
			//the object p is added to the ArrayList students
			students.add(p);
		}
		
		//Prints out all the names and score of the students in the Array List students
		for (int i = 0; i < students.size(); i++){
				System.out.println(students.get(i).name + " " + students.get(i).score);
		}
		
		//prints a blank line
		System.out.println();
		
		//declare a new variable score of type int and sets it equal to 0
		int score = 0;;
		
		//while the user didn't input an integer for their desire score,
		//the program asks them to input again
		while (true) {
			try {
				System.out.print("Input desired score: ");
				score = input.nextInt();
				break;
			}
			catch (InputMismatchException e) {
				System.out.println("Input integer number only");
				//When a scanner throws an InputMismatchException, 
				//the scanner will not pass the token that caused the exception, 
				//so that it may be retrieved or skipped via some other method.
				//So the invalid token is still there, causing another exception and another and another...
				//You need to read that token to clean the buffer and 
				//be able to read the next token the user inputs
				input.next();
			}
		}
		
		//print out a blank line
		System.out.println();
		
		//goes through all the student in the ArrayList students 
		//and checks if their scores are >= to the desired score input
		for (int i = 0; i < students.size(); i++){
			if (students.get(i).score >= score) {
				//if the score of a student is >= to the desired score input,
				//the name and score of the student is printed
				System.out.println(students.get(i).name + " " + students.get(i).score);
			}
		}
		
		//Closes the input
		//No more way to get input
		input.close();

	}

}
