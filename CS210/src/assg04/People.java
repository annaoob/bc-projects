/* 
 * CS210 Assignment 04 (CLASSES + ARRAYLISTS + SCANNER + CONSTRUCTOR + OVERLOADING)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.03.06 - Winter Quarter
 *
 * This program produces several lists of people from the file people.txt that fit a certain type
 * This specific class receives a file from another class and creates an ArrayList of all Person objects
 * It can then generate a list of names that fit the type given by another class through one of its 4 methods
 */

package assg04;

import java.io.*;
import java.util.*;

public class People {
	
	//sets up an ArrayList People of Person objects
	public ArrayList<Person> People = new ArrayList<>();
	
	//sets up a way to count how many lists have been produced
	public int counter = 1;
	
	//constructor - the class receives a file from another class
	People (String file) throws FileNotFoundException {
		
		//sets up a way to read the given file
		Scanner input = new Scanner (new File (file));
		
		//while the file has something to read, a new Person object p is created
		while (input.hasNext()){
			Person p = new Person();
			
			//the object p consists of a string job, a string name, a string gender, and an integer age
			p.job = input.next();
			p.name = input.next();
			p.gender = input.next();
			p.age = input.nextInt();
			
			//when the object p has a string job, string name, string gender, and an integer age, 
			//the object p is added to the ArrayList People
			People.add(p);
		}
	}
	
	public void list(String job) {
		//this method creates a list of people with a certain job
		
		//the program prints out the number of this list and the string ": List of people"
		//then on the next line, it prints the string "Type: " and which job the people in this list have
		System.out.println(counter + ": List of people");
		System.out.printf("Type: %s\n", job);
		
		//for all the people in the People ArrayList the program checks if they match the type this list produces
		for (int i = 0; i < People.size(); i++){
			
			//if a Person object in the People ArrayList has their job string equal to the job parameter,
			//the program prints out the name of that Person object
			if (People.get(i).job.equals(job)) {
				System.out.println(People.get(i).name);
			}
		}
		
		//prints out an empty line
		System.out.println();
		
		//the number of the lists produced increases by one
		//the next list produced is going to have a number that's one greater than this list
		counter++;
		
	}
	
	public void list(String job, String gender, int age) {
		//this method creates a list of people with a certain job and gender who are older than a certain age
		
		//the program prints out the number of this list and the string ": List of people"
		//then on the next line, it prints the string "Type: " and which job, gender, and the smallest age the people in this list have
		System.out.println(counter + ": List of people");
		System.out.println("Type: " + gender + " " + job + " " + age + " years old or older");
		
		//for all the people in the People ArrayList the program checks if they match the type this list produces
		for (int i = 0; i < People.size(); i++){
			
			//if a Person object in the People ArrayList has their job string equal to the job parameter, 
			//their gender string equal to the gender parameter, and their age integer greater than or equal to the age parameter
			//the program prints out the name of that Person object
			if (People.get(i).job.equals(job) && People.get(i).gender.equals(gender) && People.get(i).age >= age) {
				System.out.println(People.get(i).name);
			}
		}
		
		//prints out an empty line
		System.out.println();
		
		//the number of the lists produced increases by one
		//the next list produced is going to have a number that's one greater than this list
		counter++;
		
	}
	
	public void list(String job, String gender, int age1, int age2) {
		//this method creates a list of people with a certain job and gender who are in a certain age range between age1 and age2
		
		//the program prints out the number of this list and the string ": List of people"
		//then on the next line, it prints the string "Type: " and which job, gender, and what age range the people in this list have
		System.out.println(counter + ": List of people");
		System.out.println("Type: " + gender + " " + job + " " + age1 + " to " + age2 + " years old");
		
		//for all the people in the People ArrayList the program checks if they match the type this list produces
		for (int i = 0; i < People.size(); i++){
			
			//if a Person object in the People ArrayList has their job string equal to the job parameter, 
			//their gender string equal to the gender parameter, and their age integer greater than or equal to the age1 parameter, 
			//but less than or equal to the age2 parameter
			//the program prints out the name of that Person object
			if (People.get(i).job.equals(job) && People.get(i).gender.equals(gender) && People.get(i).age >= age1 && People.get(i).age <= age2) {
				System.out.println(People.get(i).name);
			}
		}
		
		//prints out an empty line
		System.out.println();
		
		//the number of the lists produced increases by one
		//the next list produced is going to have a number that's one greater than this list
		counter++;
		
	}
	
	public void list(String job, int age) {
		//this method creates a list of people with a certain job who are older than a certain age
		
		//the program prints out the number of this list and the string ": List of people"
		//then on the next line, it prints the string "Type: " and which job and the smallest age the people in this list have
		System.out.println(counter + ": List of people");
		System.out.println("Type: " + job + " " + age + " years old or older");
		
		//for all the people in the People ArrayList the program checks if they match the type this list produces
		for (int i = 0; i < People.size(); i++){
			
			//if a Person object in the People ArrayList has their job string equal to the job parameter
			//and their age integer greater than or equal to the age parameter,
			//the program prints out the name of that Person object
			if (People.get(i).job.equals(job) && People.get(i).age >= age) {
				System.out.println(People.get(i).name);
			}
		}
		
		//prints out an empty line
		System.out.println();
		
		//the number of the lists produced increases by one
		//the next list produced is going to have a number that's one greater than this list
		counter++;
		
	}

}
