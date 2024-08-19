/* 
 * CS210 Practice 12 (ArrayList vs LinkedList)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.05.25 - Spring Quarter
 *
 * This program removes half the data in an ArrayList and a LinkedList using random indexes
 * and calculates the time it takes to do so. This is done 5 times.
 * 
 * The ArrayList can remove half its data randomly faster than a LinkedList.
 * To remove a random element, a list must first find that element and then delete it.
 * ArrayList has a smaller time complexity for searching, O(1), and a Linked List has a time complexity of O(n).
 * An ArrayList has a greater time complexity for removing, because it needs to shift the elements behind the removed element.
 * The time complexity of an ArrayList for removing is O(n). The time of complexity of a LinkedList is O(1).
 * This program indicates that the actual processing time of an ArrayList is a lot smaller than of a Linked List.
 * This could possibly happen if Java can copy a segment of elements and move them forward by one index after removing an element.
 * This could be possible because of the way that ArrayList resizes itself by copying its elements from a past array into a bigger array
 * and then adding another element to itself. The fact that an ArrayList can copy its elements and the time complexity for inserting
 * an element at the back is O(n) means the ArrayList is capable of copying segments of its elements without increasing time complexity, 
 * which is what it might have done in this case as well, copying all the elements after the removed item an index forward.
 * If this is the case, this would explain why, despite ArrayList having a time complexity O(1) for searching and O(n) for removing
 * and LinkedList having a time complexity of O(n) for searching and O(1) for removing,
 * the processing time of the ArrayList is much faster than the LinkedList.
 */

package practice12_ArrayListVsLinkedList;

import java.util.*;

public class Practice12 {
	
	static int howManyTests = 5;
	static int howManyData = 60000;
	
	static ArrayList<String> AL = new ArrayList<>();
	static LinkedList<String> LL = new LinkedList<>();
	
	static Random rand = new Random();

	public static void main(String[] args) {
		
		for (int i=1; i<=howManyTests; i++) {
			initilization();
			System.out.println("Test: " + i);
			remove();
		}
	}
	
	public static void initilization() {
		AL.clear();
		LL.clear();
		
		for (int i = 0; i < howManyData; i++) {
			AL.add(Integer.toString(i));
			LL.add(Integer.toString(i));
		}
	}
	
	public static void remove() {
		
		double TimeRemove_ArrayList = 0.0;
		double TimeRemove_LinkedList = 0.0;
		double startTime, endTime;
		
		for (int i=0; i < howManyData/2; i++){ 
	
			int index2remove = rand.nextInt(AL.size());
			
			startTime = System.currentTimeMillis();
	
			AL.remove(index2remove);
			
			endTime = System.currentTimeMillis();
			TimeRemove_ArrayList += (endTime - startTime);
			
			startTime = System.currentTimeMillis();
			
			LL.remove(index2remove);
			
			endTime = System.currentTimeMillis();
			TimeRemove_LinkedList += (endTime - startTime);
			
		}
		
		System.out.println("Removed: " + (howManyData/2));
		System.out.println("ArrayList: " + (TimeRemove_ArrayList/1000.0) + " sec");
		System.out.println("LinkedList: " + (TimeRemove_LinkedList/1000.0) + " sec");
		System.out.println("ArrayList's processing time is " + (100 * (TimeRemove_ArrayList/TimeRemove_LinkedList)) + " of LinkedList");
		System.out.println();
	}
}
