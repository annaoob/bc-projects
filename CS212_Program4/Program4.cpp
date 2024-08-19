/*
 * Anna Koblova
 * Spring 2024, CS212, William Iverson
 * Section Number: 10151
 * 4/22/2024
 * Program 4: Linked List <T>
 * Program uses LinkedList.h to create 2 linked lists and test the methods in the Node and LinkedList classes
 */

// Original code from Daniel Liang (2003)
// now animated at yongdanielliang.github.io/animation/web/LinkedList.html
//
// Extensively modified by W.P. Iverson
// Bellevue College, April 2024
// for CS212

#include <iostream>
#include <string>
#include "LinkedList.h"
using namespace std;

int main()
{
	// Create a list for strings
	LinkedList<string> list;
	list.add("Bellevue");
	list.add("Tofino");

	// Create another list for strings
	LinkedList<string> list2;
	list2.add("Bellevue");
	list2.add("Ellensburg");

	//print the two lists
	cout << "list: ";
	list.printList();

	cout << "list2: ";
	list2.printList();

	// test whether list contains "Tofino", "Ellensburg", and "Bellevue" and if list2 contains "Ellensburg".
	cout << "list.contains(Tofino): " << list.contains("Tofino") << endl;
	cout << "list.contains(Ellensburg): " << list.contains("Ellensburg") << endl;
	cout << "list.contains(Bellevue): " << list.contains("Bellevue") << endl;
	cout << "list2.contains(Ellensburg): " << list2.contains("Ellensburg") << endl;

	// add list2 to list and print list
	list.addAll(list2);
	cout << "list.addAll(list2): ";
	list.printList();

	// remove list2 from list and print list
	// only "Tofino" should be printed, since every element with the value "Bellevue" would be removed,
	// even though list2 has an element with the value "Bellevue" once
	list.removeAll(list2);
	cout << "list.removeAll(list2): ";
	list.printList();

	// remove "Tofino
	// list should be empty
	list.remove("Tofino");
	cout << "list.remove(Tofino): ";
	list.printList();

	// tests for the lastIndexOf(T) method
	cout << "list.lastIndexOf(Tofino): " << list.lastIndexOf("Tofino") << endl;
	cout << "list2.lastIndexOf(Bellevue): " << list2.lastIndexOf("Bellevue") << endl;
	list2.add("Bellevue");
	cout << "list2.lastIndexOf(Bellevue): " << list2.lastIndexOf("Bellevue") << endl;

	// add list2 to the empty list
	list.addAll(list2);
	cout << "list.addAll(list2): ";
	list.printList();

	// retain list2 from list
	// list shouldn't change
	list.retainAll(list2);
	cout << "list.retainAll(list2): ";
	list.printList();

	// add "Tofino" to list
	// retaining list2 form list should remove "Tofino" from list
	list.add("Tofino");
	list.retainAll(list2);
	cout << "list.retainAll(list2): ";
	list.printList();

	// remove "Bellevue" from list
	// retaining list2 from list should make list only have "Ellensburg"
	list.remove("Bellevue");
	list.retainAll(list2);
	cout << "list.retainAll(list2): ";
	list.printList();


	return 0;
}



