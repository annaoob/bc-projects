/* 
 * CS210 Project 4 (Implementation of Min Heap)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.06.14 - Spring Quarter
 *
 * This program adds various elements from 0 to 49 to or removes the first element of an ArrayList 
 * that functions like a min heap. A min heap is a binary tree where parents are always smaller than children.
 * In terms of min heap, the program adds nodes or removes the min node, which is the root node.
 */

package project4_minHeapImplementation;

import java.util.Random;
import java.util.Stack;

public class MyHeap {

	final static int HOW_MANY_TESTs = 20;
	
	public static void main(String[] args) {
		
		System.out.println("Project 4. MinHeap (Spring 2023)\n");
		
		// create an instance of Random class
		Random rnd = new Random();
		
		// create an instance of Heap211 class
		Heap211 minHeap = new Heap211();;
		
		for (int test = 1; test <= HOW_MANY_TESTs; test++) {
			
			//generate an random number to decide the action is 'add' or 'remove'
			int action = rnd.nextInt(3);
			
			//if the number is 0 or 1, add
			if ((action == 0 || action == 1))  {
				int node = rnd.nextInt(50);
				System.out.println("Action " + test + ": Add " + node);
				minHeap.add(node);
			}
			
			//if the number is 2, remove
			if (action == 2) {
				if (minHeap.isEmpty()) {
					test = test - 1;
				}
				
				else {
					System.out.println("Action " + test+": Remove min");
					int min = minHeap.remove();
				}
				
			}
			
		}

	}

}
