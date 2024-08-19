/*
 * Anna Koblova
 * Spring 2024, CS212, William Iverson
 * Section Number: 10151
 * 6/17/2024
 * Program 12: B-tree
 * Tree234Iterator.h iterates through the keys of a 2-3-4 tree.
 */

#ifndef TREE234ITERATOR_H
#define TREE234ITERATOR_H

#include <stack>

#include "Node234.h"

class Tree234Iterator {
private:
	struct ListItem {
		ListItem(Node234* node, int key_index) {
			this->node = node;
			this->key_index = key_index;
		}
		Node234* node;
		int key_index;
	};
	std::stack<ListItem> parents;
public:
	Tree234Iterator(Node234 *root) {
		Node234* current = root;
		while (current != nullptr) {
			parents.push(ListItem(current, -1));
			current = current->left;
		}
		if (!parents.empty()) {
			++parents.top().key_index;  // positioning in the first element
		}
	}

	Tree234Iterator(const Tree234Iterator &toCopy) {
		parents = toCopy.parents;
	}

    // Copies the other iterator's data to this iterator.
	Tree234Iterator& operator=(const Tree234Iterator &other) {
		parents = other.parents;
		return *this;
	}
    // Returns true if this iterator represents the same point of iteration as
    // the other, false otherwise.
	bool operator==(const Tree234Iterator &other) const {
		if (parents.size() != other.parents.size()) {
			return false;
		}
		if (parents.empty()) {
			return true;
		}
		return parents.top().key_index == other.parents.top().key_index &&
			   parents.top().node == other.parents.top().node;
	}

   // Returns false if this iterator represents the same point of iteration as
   // the other, true otherwise.
	bool operator!=(const Tree234Iterator &other) const {
		return !(*this == other);
	}

    // Returns the key that this iterator currently points to.
	int operator*() const {
        if (parents.empty()) {
		  return -1;
        }
        switch (parents.top().key_index) {
          case 0: return parents.top().node->A;
          case 1: return parents.top().node->B;
          case 2: return parents.top().node->C;
        }
        return -1;
	}

    // Advances this iterator to the tree's next key.
	Tree234Iterator& operator++() {
		if (parents.empty()) {
			return *this;
		}
		Node234* next = nullptr;
		switch (parents.top().key_index) {
		  case -1: next = parents.top().node->left; break;
		  case  0: next = parents.top().node->middle1; break;
		  case  1: next = parents.top().node->middle2; break;
		  case  2: next = parents.top().node->right; break;
		}
		while (next != nullptr) {
			parents.push(ListItem(next, -1));
			next = next->left;
		}
		while (!parents.empty() && ++parents.top().key_index >= parents.top().node->keyCount) {
			parents.pop();
		}
		return *this;
	}
};
#endif
