/*
 * Anna Koblova
 * Spring 2024, CS212, William Iverson
 * Section Number: 10151
 * 4/22/2024
 * Program 4: Linked List <T>
 * LinkedList.h creates the Node and LinkedList classes
 */

// Original code from Daniel Liang (2003)
// now animated at yongdanielliang.github.io/animation/web/LinkedList.html
//
// Extensively modified by W.P. Iverson
// Bellevue College, April 2024
// for CS212

#include <stdexcept>
#include <iostream>
using namespace std;

template<typename T>
class Node
{
public:
  Node() // No-arg constructor
  {
    next = nullptr;
  }

  Node(T element) // Constructor
  {
    this->element = element;
    next = nullptr;
  }

  // just for console testing:
  void printNodes()
  {
	  //prints nodes until the current node is nullptr
      Node<T>* current = this;
      while (current->next != nullptr)
      {
          cout << current->element << " ";
          current = current->next;
      }
      cout << current->element << endl;
  }

  // so we can keep nodes private
  void setNext(Node<T>* change)
  {
      next = change;
  }

  // to be able to access next element in the list
  Node<T>* getNext() {
	  return next;
  }

  const T& getData() const
  {
      return element;
  }


private:
    T element;  // Element contained in the node
    Node<T>* next; // Pointer to the next node
};

// template linked list class
template<typename T>
class LinkedList
{
public:
  LinkedList();
  void addLast(T);  // adds element to the end of the LinkedList
  void add(T);  // Standard List adds data at end of list
  void printList() const;  // prints LinkedList
  bool addAll(const LinkedList<T>& other);  // adds all of otherList to LinkedList, including any repeated elements
  bool remove(const T& value);  // removes all elements that have a certain value from LinkedList
  bool contains(const T& value) const;  // checks if the LinkedList contains at least one element with a certain value
  int lastIndexOf(const T& value) const;  // finds the index of the last element that has a certain value
  bool removeAll(const LinkedList<T>& otherList);  // removes all of otherList from LinkedList. If an element of otherList repeats in LinkedList, all repeated elements are also deleted
  bool retainAll(const LinkedList<T>& otherList);  // retains the intersection of LinkedList and otherList in LinkedList

private:
    Node<T>* head;
	Node<T>* tail;
    int size;
};

template<typename T>
LinkedList<T>::LinkedList()
{
  head = tail = nullptr;
  size = 0;
}

// prints LinkedList
template<typename T>
void LinkedList<T>::printList() const
{
	if (head != nullptr) {
      head->printNodes();
	} else {
	  cout << endl;
	}
}

// adds element to the end of the LinkedList
template<typename T>
void LinkedList<T>::addLast(T element)
{
  if (tail == nullptr)
  {
    head = tail = new Node<T>(element);
  }
  else
  {
      Node<T>* temp = new Node<T>(element);
      tail->setNext(temp);
      tail = temp;
  }
  size++;
}

// Standard List adds data at end of list
template<typename T>
void LinkedList<T>::add(T element)
{
  addLast(element);
}

// adds all of otherList to LinkedList, including any repeated elements
// this method has O(N) complexity, where N is the size of otherList.
template<typename T>
bool LinkedList<T>::addAll(const LinkedList<T>& otherList)
{
	Node<T>* cur = otherList.head;
	while (cur != nullptr) {
		this->add(cur->getData());
		cur = cur->getNext();
	}
	// returns true if at least one element was added
	return otherList.head != nullptr;
}

// removes all of otherList from LinkedList
// if an element of otherList repeats in LinkedList, all repeated elements are also deleted
// this method has O(N^2) complexity
template<typename T>
bool LinkedList<T>::removeAll(const LinkedList<T>& otherList)
{
	bool result = false;
	Node<T>* cur = otherList.head;
		while (cur != nullptr) {
			// remove(cur->getData) removes from LinkedList, not otherList
			if (this->remove(cur->getData())) {
				result = true;
			}
			// information about cur still saved since cur is still in otherList
			// we can use getNext()
			cur = cur->getNext();
		}
	// returns true if at least one element was removed
    return result;
}

// retains the intersection of LinkedList and otherList in LinkedList
// this method has O(N^2) complexity
template<typename T>
bool LinkedList<T>::retainAll(const LinkedList<T>& otherList)
{
	bool result = false;
	Node<T>* cur = head;
	while (cur != nullptr) {
		// need to remember the next node in case we delete the current node
		Node<T>* next = cur->getNext();
		if (!otherList.contains(cur->getData())) {
			if (this->remove(cur->getData())) {
			  result = true;
			}
		}
		cur = next;
	}
	// returns true if at least one element was removed
    return result;
}

// removes all elements that have a certain value from LinkedList
// this method has O(N) complexity
template<typename T>
bool LinkedList<T>::remove(const T& value)
{
	bool result = false;
	Node<T>* prev = nullptr;
	Node<T>* cur = head;
	while (cur != nullptr) {
		if (value == cur->getData()) {
		  result = true;
		  if (prev != nullptr) {
			  prev->setNext(cur->getNext());
		  } else {
			  head = cur->getNext();
		  }
		  if (cur->getNext() == nullptr) {
			  tail = prev;
		  }
		  // by creating and deleting the Node<T>* t,
		  // we avoid deleting cur and being unable to use getNext() to go to the next node
		  Node<T>* t = cur;
		  cur = cur->getNext();
		  delete t;
		} else {
		  prev = cur;
		  cur = cur->getNext();
		}
	}
	// returns true if at least one element was removed
    return result;
}

// finds the index of the last element that has a certain value
// this method has O(N) complexity
template<typename T>
int LinkedList<T>::lastIndexOf(const T& value) const
{
	int result = -1;
	Node<T>* cur = head;
	int i = 0;
	while (cur != nullptr) {
		if (value == cur->getData()) {
          result = i;
		}
		cur = cur->getNext();
		i++;
	}
	return result;
}

// checks if the LinkedList contains at least one element with a certain value
// this method has O(N) complexity
template<typename T>
bool LinkedList<T>::contains(const T& value) const
{
	Node<T>* cur = head;
	while (cur != nullptr) {
		if (value == cur->getData()) {
          return true;
		}
		cur = cur->getNext();
	}
	return false;
}

