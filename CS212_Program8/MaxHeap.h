/*
 * Anna Koblova
 * Spring 2024, CS212, William Iverson
 * Section Number: 10151
 * 5/20/2024
 * Program 8: Heaps
 * Program creates a heap.
 */

#ifndef MAXHEAP_H
#define MAXHEAP_H

#include <iostream>
#include <ostream>
#include <string>

class MaxHeap {
private:
   int* heapArray;
   int allocationSize;
   int heapSize;

   void PercolateDown(int nodeIndex) {
      int childIndex = 2 * nodeIndex + 1;
      int value = heapArray[nodeIndex];

      while (childIndex < heapSize) {
         // Find the max among the node and all the node's children
         int maxValue = value;
         int maxIndex = -1;
         int i = 0;
         while (i < 2 && i + childIndex < heapSize) {
            if (heapArray[i + childIndex] > maxValue) {
               maxValue = heapArray[i + childIndex];
               maxIndex = i + childIndex;
            }
            i++;
         }

         // Check for a violation of the max-heap property
         if (maxValue == value) {
            return;
         }
         else {
            // Swap heapArray[nodeIndex] and heapArray[maxIndex]
            std::cout << "   PercolateDown() swap: " << heapArray[nodeIndex];
            std::cout << " <-> " << heapArray[maxIndex] << std::endl;
            int temp = heapArray[nodeIndex];
            heapArray[nodeIndex] = heapArray[maxIndex];
            heapArray[maxIndex] = temp;

            // Continue loop from the max index node
            nodeIndex = maxIndex;
            childIndex = 2 * nodeIndex + 1;
         }
      }
   }

   void PercolateUp(int nodeIndex) {
      while (nodeIndex > 0) {
         // Compute the parent node's index
         int parentIndex = (nodeIndex - 1) / 2;

         // Check for a violation of the max-heap property
         if (heapArray[nodeIndex] <= heapArray[parentIndex]) {
            // No violation, so percolate up is done.
            return;
         }
         else {
            // Swap heapArray[nodeIndex] and heapArray[parentIndex]
            std::cout << "   PercolateUp() swap: " << heapArray[parentIndex];
            std::cout<< " <-> " << heapArray[nodeIndex] << std::endl;
            int temp = heapArray[nodeIndex];
            heapArray[nodeIndex] = heapArray[parentIndex];
            heapArray[parentIndex] = temp;

            // Continue the loop from the parent node
            nodeIndex = parentIndex;
         }
      }
   }

   void ResizeArray() {
      int newAllocationSize = allocationSize * 2;
      int* newArray = new int[newAllocationSize];
      if (newArray) {
         // Copy from existing array to new array
         for (int i = 0; i < allocationSize; i++) {
            newArray[i] = heapArray[i];
         }

         // Delete old array and set pointer to new
         delete[] heapArray;
         heapArray = newArray;

         // Update allocation size
         allocationSize = newAllocationSize;
      }
   }

public:
   MaxHeap() {
	  allocationSize = 1;
      heapArray = new int[allocationSize];
      heapSize = 0;
   }

   // constructor that takes array and array size to create a heap
   MaxHeap(int* array, size_t size) {
	  heapSize = size;
	  allocationSize = size;
	  heapArray = new int[size];
	  // memcpy copies data in array into heapArray when given where to copy, from where to copy, and how many bytes to copy
	  memcpy(heapArray, array, size * sizeof(array[0]));
	  // Heapifies the array starting with the last to bottom layer (the bottom layer is the last size/2 elements),
	  // the for loop percolates down if a current element has a priority lower than its children.
	  // Works because the layers below the one we're on are all sorted. It is possible to prove that
	  // this approach creates a heap in O(N) time.
	  for (int i = size / 2 - 1; i >= 0; i--) {
		 PercolateDown(i);
	  }
   }

   virtual ~MaxHeap() {
      delete[] heapArray;
   }

   void Insert(int value) {
      // Resize if needed
      if (heapSize == allocationSize) {
         ResizeArray();
      }

      // Add the new value to the end of the array
      std::cout << "Insert(" << value << "):" << std::endl;
      heapArray[heapSize] = value;
      heapSize++;

      // Percolate up from the last index to restore heap property
      PercolateUp(heapSize - 1);
   }

   int Remove() {
      // Save the max value from the root of the heap
      std::cout << "Remove():" << std::endl;
      int maxValue = heapArray[0];

      // Move the last item in the array into index 0
      int replaceValue = heapArray[heapSize - 1];
      heapSize--;
      if (heapSize > 0) {
         heapArray[0] = replaceValue;

         // Percolate down to restore max-heap property
         PercolateDown(0);
      }

      // Return the max value
      return maxValue;
   }

   std::string GetHeapArrayString() const {
      if (heapSize == 0) {
         return std::string("[]");
      }

      std::string arrayString("[");
      arrayString += std::to_string(heapArray[0]);
      for (int i = 1; i < heapSize; i++) {
         arrayString += ", ";
         arrayString += std::to_string(heapArray[i]);
      }
      arrayString += "]";
      return arrayString;
   }

   int GetHeapSize() {
      return heapSize;
   }
};

// Overloads the << operator to print out the heap to an output stream.
inline std::ostream& operator << (std::ostream& stream, const MaxHeap& heap) {
  return (stream << heap.GetHeapArrayString());
}

#endif
