/*
 * Anna Koblova
 * Spring 2024, CS212, William Iverson
 * Section Number: 10151
 * 6/3/2024
 * Program 10: Graph
 * AdjacencyListGraph.h can add and find vertexes and edges from and to a vertex
 */

/* Authors:
 Evan Olds / Senior Content Developer / zyBooks
 Roman Lysecky / Professor of Electrical and Computer Engineering / Univ.of Arizona
 Frank Vahid / Professor of Computer Science and Engineering / Univ.of California,
 Riverside
 February 2024
 */
#ifndef ADJACENCYLISTGRAPH_H
#define ADJACENCYLISTGRAPH_H
#include "DirectedGraph.h"
#include "AdjacencyListVertex.h"
class AdjacencyListGraph: public DirectedGraph {
protected:
	std::vector<AdjacencyListVertex*> vertices;

public:
	virtual ~AdjacencyListGraph() {
		for (AdjacencyListVertex *vertex : vertices) {
			delete vertex;
		}
	}

	// Creates and adds a new vertex to the graph, provided a vertex with the
	// same label doesn't already exist in the graph. Returns the new vertex on
	// success, nullptr on failure.
	virtual Vertex* AddVertex(std::string newVertexLabel) override {
		// For all the vertexes in the graph, checks if the given vertex label already exists
		for (AdjacencyListVertex *vertex : vertices) {
			if (vertex->GetLabel() == newVertexLabel) {
				return nullptr;
			}
		}
		// Creates a new vertex using the newVertexLabel and adds it to the vertices vector
		AdjacencyListVertex* v = new AdjacencyListVertex(newVertexLabel);
		vertices.push_back(v);
		return v;
	}

	// Adds a directed edge from the first to the second vertex. If the edge
	// already exists in the graph, no change is made and false is returned.
	// Otherwise the new edge is added and true is returned.
	virtual bool AddDirectedEdge(Vertex *fromVertex, Vertex *toVertex) override {
		// Casts fromVertex to AjacencyListVertex, using dynamic_cast ensures that
		// fromVertex of incompatible type will result in nullptr.
		AdjacencyListVertex* from = dynamic_cast<AdjacencyListVertex*>(fromVertex);
		if (toVertex == nullptr) { return false; }  // If toVertex is null, no edge can be added
		if (from == nullptr) { return false; } // If from is null, no edge can be added
		// For every vertex adjacent to fromVertex, checks if those vertexes are equal to the toVertex
		// and if the edge to be added already exists
		for (Vertex* vertex : from->adjacent) {
			if (vertex == toVertex) {
				return false;
			}
		}

		// Adds the toVertex to the vertexes adjacent to fromVertex
		from->adjacent.push_back(toVertex);

		return true;
	}

	// Returns a vector of edges with the specified fromVertex.
	virtual std::vector<Edge> GetEdgesFrom(Vertex *fromVertex) override {
		// Creates vector of edges
		std::vector<Edge> edges;
		// Casts fromVertex to AjacencyListVertex, using dynamic_cast ensures that
		// fromVertex of incompatible type will result in nullptr.
		AdjacencyListVertex* from = dynamic_cast<AdjacencyListVertex*>(fromVertex);
		if (from == nullptr) { return edges; } // If from is null, there are no edges
		// For every vertex that is adjacent to fromVertex, creates and adds an edge to the vector edges
		for (Vertex* vertex : from->adjacent) {
			Edge e(from, vertex);
			edges.push_back(e);
		}
		return edges;
	}

	// Returns a vector of edges with the specified toVertex.
	virtual std::vector<Edge> GetEdgesTo(Vertex *toVertex) override {
		// Creates a vector of edges
		std::vector<Edge> edges;
		// For all the vertexes in the graph, checks what vertices are adjacent to that vertex
		// If one of the adjacent vertexes is the toVertex, creates and adds an edge to the vector edges
		for (AdjacencyListVertex *from : vertices) {
			for (Vertex* v : from->adjacent) {
				if (v == toVertex) {
					Edge e(from, toVertex);
					edges.push_back(e);
				}
			}
		}
		return edges;
	}

	// Returns a vertex with a matching label, or nullptr if no such vertex
	// exists
	virtual Vertex* GetVertex(std::string vertexLabel) override {
		// For all the vertexes in the graph, checks if the vertex's label is vertexLabel
		for (AdjacencyListVertex *vertex : vertices) {
			if (vertex->GetLabel() == vertexLabel) {
				return vertex;
			}
		}
		return nullptr;
	}

	// Returns true if this graph has an edge from fromVertex to toVertex
	virtual bool HasEdge(Vertex *fromVertex, Vertex *toVertex) override {
		// Casts fromVertex to AjacencyListVertex, using dynamic_cast ensures that
		// fromVertex of incompatible type will result in nullptr.
		AdjacencyListVertex* from = dynamic_cast<AdjacencyListVertex*>(fromVertex);
		if (from == nullptr) { return false; } // If from is null, there is no such edge
		// For every vertex that is adjacent to fromVertex, checks if one of those vertexes is equal to the toVertex
		for (Vertex* vertex : from->adjacent) {
			if (vertex == toVertex) {
				return true;
			}
		}
		return false;
	}
};
#endif
