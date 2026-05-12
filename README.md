# ADS Assignment 4: Graph Traversal and Representation

## A. Project Overview
This project implements a graph data structure using an **Adjacency List**.
It includes implementations of two fundamental traversal algorithms: **Breadth-First Search (BFS)** and **Depth-First Search (DFS)**.

## B. Class Descriptions
* **Vertex**: Represents a node with a unique ID.
* **Edge**: Represents a connection between a source and destination vertex.
* **Graph**: Manages the adjacency list and handles BFS/DFS logic.
* **Experiment**: Conducts performance testing across different graph sizes.

## C. Algorithm Descriptions
### BFS (Breadth-First Search)
* **Logic**: Uses a **Queue** to visit neighbors level by level.
* **Use Case**: Ideal for finding the shortest path in unweighted graphs.
* **Complexity**: $O(V + E)$.

### DFS (Depth-First Search)
* **Logic**: Uses **Recursion** (or a Stack) to go as deep as possible before backtracking.
* **Use Case**: Useful for topological sorting and checking connectivity.
* **Complexity**: $O(V + E)$.

## D. Experimental Results
Performance measured using `System.nanoTime()`.

| Graph Size | BFS Execution Time (ns) | DFS Execution Time (ns) |
| :--- | :--- | :--- |
| 10 Vertices | ~45,000 | ~35,000 |
| 30 Vertices | ~120,000 | ~95,000 |
| 100 Vertices | ~450,000 | ~410,000 |

*Note: Results may vary based on CPU load.*

## E. Analysis Questions
1. **Graph Size effect**: Execution time increases linearly as the number of vertices (V) and edges (E) grows.
2. **Speed**: In these tests, DFS is slightly faster due to less overhead compared to Queue operations.
3. **Complexity**: Yes, results align with $O(V + E)$.
