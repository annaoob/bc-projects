/* 
 * CS210 Project 4 (Implementation of Min Heap)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.05.25 - Spring Quarter
 *
 * This class operates the ArrayList heap that functions like a min heap. It ensures new nodes are bubbled up to the correct position,
 * when nodes are removes, the root node is replaced with the last element in the ArrayList and then bubbled down.
 */

package project4_minHeapImplementation;

import java.util.ArrayList;

public class Heap211 {

	static public ArrayList <Integer> heap = new ArrayList<>();
	
	//need to add 0 so index of root node is 1
	Heap211() {
		heap.add(0);
	}
	
	//finds the index of the parent node
	int parent(int index) {
		return ((int) (index/2));
	}
	
	//finds the index of the left child node
	int leftChild(int index) {
		return ((int) (2*index));
	}
	
	//finds the index of the right child node
	int rightChild(int index) {
		return ((int) ((2*index)+1));
	}
	
	//says if a node has a parent
	boolean hasParent(int index) {
		return (((int) (index)) > 1);
	}
	
	//says if a node has a left child
	boolean hasLeftChild(int index) {
		return ((int) (2*index) < heap.size());
	}
		
	//says if a node has a right child
	boolean hasRightChild(int index) {
		return ((int) ((2*index)+1) < heap.size());
	}
	
	//swaps 2 elements given their indexes
	void swap(int a, int b) {
		int temp = heap.get(a);
		heap.set(a, heap.get(b));
		heap.set(b,temp);
		System.out.println("     swap: " + heap.get(b) + "<->" + heap.get(a));
	}

	//finds the smallest element/ root node
	int peekMin() {
		return heap.get(1);
	}
	
	//checks if the heap is empty
	boolean isEmpty() {
		return heap.size() == 1;
	}
	
	//adds a node
	void add(int value) {
		heap.add(value);
		System.out.println(" heap: " + printHeap());
		System.out.println(" bubble-up: start");
		
		// "bubbling up" as necessary to fix ordering
		int index = heap.size() - 1;
		boolean found = false;
		
		while (!found && hasParent(index)) {
			
			int parent = parent(index);
			
			if (heap.get(index) < heap.get(parent)) {
				swap(index, parent(index));
				index = parent(index);
			} else {
				found = true; // found proper location; stop
			}
		}
		
		System.out.println(" bubble-up: end");
		System.out.println(" new heap: " +printHeap());
		System.out.println();
	}
	
	//removes the top node
	int remove() {
		System.out.println(" heap: " + printHeap());
		
		int min = peekMin();
		heap.set(1, heap.get(heap.size()-1));
		System.out.println(" Removed: " + min);
		int removeIndex = heap.size()-1;
		heap.remove(removeIndex);
		
		if (heap.size() > 1) { System.out.println(" last node(" + heap.get(1) + ") is moved to the root"); }
		System.out.println(" heap: " + printHeap());
		System.out.println(" bubble-down: start");
		
		int index = 1; // "bubble down" to fix ordering
		boolean found = false;
		
		//bubbles down while correct position for node not found
		while (!found && hasLeftChild(index) && heap.size() > 1) {
			
			int left = leftChild(index);
			int right = rightChild(index);
			int child = left;
			
			if (hasRightChild(index) && heap.get(right) < heap.get(left)) {
				child = right;
			}
			if (heap.get(index) > heap.get(child)) {
				swap(index, child);
				index = child;
			} else {
				found = true; // found proper location; stop
			}
		}
		
		System.out.println(" bubble-down: end");
		System.out.println(" new heap: " + printHeap());
		System.out.println();
		
		return min;
	}
	
	//use this method as is
	public String printHeap(){
		StringBuilder result = new StringBuilder("[");
		if (heap.size()>1) {
			result.append(heap.get(1));
		}
		for (int i = 2; i < heap.size(); i++){
			result.append(", ").append(heap.get(i));
		}
		return result + "]";
	}
	
}
