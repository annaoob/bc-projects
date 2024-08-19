/*
 * Anna Koblova
 * Spring 2024, CS212, William Iverson
 * Section Number: 10151
 * 5/13/2024
 * Program 7: AVL Tree
 * Program creates an AVL Tree and maintains balance in it
 */

#include <iostream>
#include "AVLTree.h"
#include "BSTPrint.h"
using namespace std;


int main() {
   // Create an empty AVLTree object.
   AVLTree<double> tree;

   // Insert some random-looking integers into the tree.
   double keys[] = { 10.122345, 20.221162, 5.13859, 22.890386, 15.317649, 47.999999, 19.734929, 3.018294, 12.295031, 8.380182};
   for (double key : keys) {
      Node<double>* node = new Node<double>(key);
      tree.Insert(node);
   }

   // Print the tree after all inserts are complete.
   cout << "Tree after initial insertions:" << endl;
   cout << BSTPrint<double>::TreeToString(tree.GetRoot()) << endl;
   cout << endl;

   // Find and remove the node with the key value 12.
   // This should cause a right rotation on node 10.
   cout << "Remove node 12.295031:" << endl;
   tree.RemoveKey(12.295031);
   cout << BSTPrint<double>::TreeToString(tree.GetRoot()) << endl;
   cout << endl;

   // Find and remove the node with the key value 20.
   // This should cause its right child to shift up into
   // the 20 node's position without any other reordering
   // required.
   cout << "Remove node 20.221162:" << endl;
   tree.RemoveKey(20.221162);
   cout << BSTPrint<double>::TreeToString(tree.GetRoot()) << endl;
   cout << endl;

   // Attempt to remove a node with key 30, a value not in the tree.
   cout << "Remove node 30.382945 (should not be in tree):" << endl;
   if (!tree.RemoveKey(30.382945)) {
      cout << "*** Key not found. Tree is not changed. ***" << endl;
   }
   cout << BSTPrint<double>::TreeToString(tree.GetRoot()) << endl;
}


