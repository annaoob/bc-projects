/*
 * Node.h
 *
 *  Created on: May 5, 2024
 *      Author: anna
 */

#ifndef NODE_H_
#define NODE_H_

template<typename T>

class Node {
public:
   int key;
   Node* left;
   Node* right;

   Node(T nodeKey) {
      key = nodeKey;
      left = nullptr;
      right = nullptr;
   }
};


#endif /* NODE_H_ */
