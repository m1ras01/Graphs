# Graph Algorithms: BFS and Dijkstra

This project implements Breadth-First Search (BFS) and Dijkstra's algorithm for edge-weighted graphs with vertex objects. The project consists of the following classes:

- `Vertex`: Represents a vertex in the graph.
- `WeightedGraph`: Represents a weighted graph with vertex objects.
- `Edge`: Represents an edge between two vertices with a weight.
- `Search`: Base class for graph search algorithms.
- `BreadthFirstSearch`: Implements the BFS algorithm.
- `DijkstraSearch`: Implements Dijkstra's algorithm.
- `Main`: Contains an example usage of BFS and Dijkstra's algorithm on a weighted graph.

## Class Descriptions

### `Vertex`
The `Vertex` class represents a vertex in the graph. It has a data field to store the vertex value and a map to store adjacent vertices along with their weights. The class provides methods to add adjacent vertices.

### `WeightedGraph`
The `WeightedGraph` class represents a weighted graph with vertex objects. It uses a map to store the vertices and their corresponding edges. It provides methods to add vertices and edges to the graph, as well as retrieve the edges for a given vertex.

### `Edge`
The `Edge` class represents an edge between two vertices with a weight. It has fields for the source vertex, destination vertex, and weight. It provides getters for accessing these fields.

### `Search`
The `Search` class is a base class for graph search algorithms. It takes a `WeightedGraph` object as a parameter in its constructor.

### `BreadthFirstSearch`
The `BreadthFirstSearch` class extends `Search` and implements the BFS algorithm. It uses a queue and a set to keep track of visited vertices. It also maintains a parent map to store the parent vertex for each visited vertex.

### `DijkstraSearch`
The `DijkstraSearch` class extends `Search` and implements Dijkstra's algorithm. It uses a priority queue and a distance map to keep track of the shortest distance from the start vertex to each vertex in the graph. It also maintains a parent map to store the parent vertex for each vertex in the shortest path.

 





