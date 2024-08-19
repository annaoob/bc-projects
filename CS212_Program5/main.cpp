/*
 * Anna Koblova
 * Spring 2024, CS212, William Iverson
 * Section Number: 10151
 * 4/29/2024
 * Program 5: Hash<CalendarDate>
 * Program puts CalendarDate objects in a chaining hash table and prints it
 */

#include <iostream>
#include <string>
#include <vector>

#include "HashTable.h"
#include "ChainingHashTable.h"
#include "CalendarDate.h"

int main() {

	CalendarDate dates[] = {
			CalendarDate(12, 21, 2024),
	        CalendarDate(11, 11, 1250),
	        CalendarDate(10, 11, 1800),
	        CalendarDate(12, 11, 1100),
	        CalendarDate(10, 11, 2050),
	        CalendarDate(10, 11, 2004)
	    };

   int datesLength = sizeof(dates) / sizeof(dates[0]);

   const int initialCapacity = 11;

   HashTable<int,CalendarDate>* table = new ChainingHashTable<int,CalendarDate>(initialCapacity);

   // Add the same content to the hash table
   for (int i = 0; i < datesLength; i++) {
	   table->Insert(dates[i].hashCode(), dates[i]);
   }

   std::cout << table->PrintTable();
}


