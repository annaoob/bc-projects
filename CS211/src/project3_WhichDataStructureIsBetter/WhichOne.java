/* 
 * CS210 Project 3 (Which Data Structure is Better)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.05.25 - Spring Quarter
 *
 * This program tests to see how quickly the ArrayList and Linked List can add, search for, and remove a certain amount of data.
 */

package project3_WhichDataStructureIsBetter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class WhichOne {

	//how much data will be removed
	static int howManyTests = 50000;
	
	//create ArrayList and Linked List
	static ArrayList<String> AL = new ArrayList<>();
	static LinkedList<String> LL = new LinkedList<>();
	
	//create variables of the time it takes to add, search, and remove in the ArrayList and Linked List
	static double TimeAdd_LinkedList;
	static double TimeAdd_ArrayList;
	static double TimeSearch_LinkedList;
	static double TimeSearch_ArrayList;
	static double TimeRemove_ArrayList;
	static double TimeRemove_LinkedList;
	static double startTime, endTime;
	
	//create a way to generate a random number and to create the graphic version
	static Random rand = new Random();
	static Bar211 bar ; // for graphic version

	public static void main(String[] args) {
		
		bar = new Bar211("CS 211, Spring 2023", howManyTests);
		
		add();
		search();
		remove();
	}
	
	//this method resets the ArrayList and Linked List to have a certain amount of data
	public static void initilization() {
		
		AL.clear();
		LL.clear();
		
		for (int i = 0; i < howManyTests; i++) {
			AL.add(Integer.toString(i));
			LL.add(Integer.toString(i));
		}
	}
	
	public static void add() {
		
		//reset the ArrayList and LinkedList
		initilization();
		
		//add half as many data points as there already are in the ArrayList and LinkedList
		for (int i=0; i < howManyTests/2; i++){ 
			
			int randomIndex = rand.nextInt(AL.size());
			String value2add = Integer.toString(randomIndex);
			
			//find the time it takes to add one random element in ArrayList, and add it to TimeAdd_ArrayList
			startTime = System.currentTimeMillis();
			AL.add(randomIndex, value2add);
			endTime = System.currentTimeMillis();
			TimeAdd_ArrayList += (endTime - startTime);
			bar.setTimeAddAL(TimeAdd_ArrayList);
			
			//find the time it takes to add one random element in LinkedList, and add it to TimeAdd_LinkedList
			startTime = System.currentTimeMillis();
			LL.add(randomIndex, value2add);
			endTime = System.currentTimeMillis();
			TimeAdd_LinkedList += (endTime - startTime);
			bar.setTimeAddLL(TimeAdd_LinkedList);
			
		}
		
		//print the results
		System.out.println("Add: " + (howManyTests/2));
		System.out.println("ArrayList: " + (TimeAdd_ArrayList/1000.0) + " sec");
		System.out.println("LinkedList: " + (TimeAdd_LinkedList/1000.0) + " sec");
		System.out.println("ArrayList's processing time is " + (100 * (TimeAdd_ArrayList/TimeAdd_LinkedList)) + "% of LinkedList");
		System.out.println();
	}
	
	public static void search() {
		
		//reset the ArrayList and LinkedList
		initilization();
		
		//search for half as many data points as there already are in the ArrayList and LinkedList
		for (int i=0; i < howManyTests/2; i++){ 
			
			int indexOfValue;
			int randomIndex = rand.nextInt(AL.size());
			String value2search = Integer.toString(randomIndex);
			
			//find the time it takes to search for the index of one random element in ArrayList, and add it to TimeSearch_ArrayList
			startTime = System.currentTimeMillis();
			indexOfValue = AL.indexOf(value2search);
			endTime = System.currentTimeMillis();
			TimeSearch_ArrayList += (endTime - startTime);
			bar.setTimeSearchAL(TimeSearch_ArrayList);
			
			//find the time it takes to search for the index of one random element in LinkedList, and add it to TimeSearch_LinkedList
			startTime = System.currentTimeMillis();
			indexOfValue = LL.indexOf(value2search);
			endTime = System.currentTimeMillis();
			TimeSearch_LinkedList += (endTime - startTime);
			bar.setTimeSearchLL(TimeSearch_LinkedList);
			
		}
		
		//print the results
		System.out.println("Search: " + (howManyTests/2));
		System.out.println("ArrayList: " + (TimeSearch_ArrayList/1000.0) + " sec");
		System.out.println("LinkedList: " + (TimeSearch_LinkedList/1000.0) + " sec");
		System.out.println("ArrayList's processing time is " + (100 * (TimeSearch_ArrayList/TimeSearch_LinkedList)) + "% of LinkedList");
		System.out.println();
		
	}
	
	public static void remove() {
		
		//reset the ArrayList and LinkedList
		initilization();
		
		//remove half as many data points as there already are in the ArrayList and LinkedList
		for (int i=0; i < howManyTests/2; i++){ 
	
			int index2remove = rand.nextInt(AL.size());
			
			//find the time it takes to remove one random element in ArrayList, and add it to TimeRemove_ArrayList
			startTime = System.currentTimeMillis();
			AL.remove(index2remove);
			endTime = System.currentTimeMillis();
			TimeRemove_ArrayList += (endTime - startTime);
			bar.setTimeRemoveAL(TimeRemove_ArrayList);
			
			//find the time it takes to remove one random element in LinkedList, and add it to TimeRemove_LinkedList
			startTime = System.currentTimeMillis();
			LL.remove(index2remove);
			endTime = System.currentTimeMillis();
			TimeRemove_LinkedList += (endTime - startTime);
			bar.setTimeRemoveLL(TimeRemove_LinkedList);

		}
		
		//print the results
		System.out.println("Removed: " + (howManyTests/2));
		System.out.println("ArrayList: " + (TimeRemove_ArrayList/1000.0) + " sec");
		System.out.println("LinkedList: " + (TimeRemove_LinkedList/1000.0) + " sec");
		System.out.println("ArrayList's processing time is " + (100 * (TimeRemove_ArrayList/TimeRemove_LinkedList)) + "% of LinkedList");
		System.out.println();
	}

}
