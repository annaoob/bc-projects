/* 
 * CS210 Assignment 04 (CLASSES + ARRAYLISTS + SCANNER + CONSTRUCTOR + OVERLOADING)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.03.06 - Winter Quarter
 *
 * This program produces several lists of people from the file people.txt that fit a certain type
 * This specific class calls upon the class People to do this
 */

package assg04;

import java.util.*;
import java.io.*;

public class Assg04_AnnaKoblova {

	public static void main(String[] args) throws FileNotFoundException {
		
		//creates a way to generate a random number
		Random random = new Random();
		
		//creates an object p in class People and gives it a people.txt file
		People p = new People("people.txt");
		
		p.list("student"); //creates a list of students
		p.list("teacher"); //creates a list of teachers
		p.list("student", "female", random.nextInt(7)+14); //creates a list of female students that are older than a random integer between 14-20
		p.list("student", "male", random.nextInt(7)+14); //creates a list of male students that are older than a random integer between 14-20
		p.list("teacher", "female", random.nextInt(11)+30); //creates a list of female teachers that are older than a random integer between 30-40
		p.list("teacher", "male", random.nextInt(11)+30); //creates a list of male teachers that are older than a random integer between 30-40
		p.list("student", "female", random.nextInt(4)+14, random.nextInt(3)+18); //creates a list of female students that are older than a random integer between 14-17 but younger than a random integer between 18-20
		p.list("student", "male", random.nextInt(4)+14, random.nextInt(3)+18); //creates a list of male students that are older than a random integer between 14-17 but younger than a random integer between 18-20
		p.list("teacher", "female", random.nextInt(5)+30, random.nextInt(6)+35); //creates a list of female teachers that are older than a random integer between 30-34 but younger than a random integer between 35-40
		p.list("teacher", "male", random.nextInt(5)+30, random.nextInt(6)+35); //creates a list of male teachers that are older than a random integer between 30-34 but younger than a random integer between 35-40
		p.list("student", random.nextInt(7)+14); //creates a list of students that are older than a random integer between 14-20
		p.list("teacher", random.nextInt(11)+30); //creates a list of teachers that are older than a random integer between 30-40

	}

}
