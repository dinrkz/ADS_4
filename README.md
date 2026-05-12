# ADS Assignment 4: Graph Traversal and Representation

## A. Project Overview
[cite_start]This project implements a graph data structure using an **Adjacency List**[cite: 35]. [cite_start]It includes implementations of two fundamental traversal algorithms: **Breadth-First Search (BFS)** and **Depth-First Search (DFS)**[cite: 13, 14].

## B. Class Descriptions
* [cite_start]**Vertex**: Represents a node with a unique ID[cite: 16, 19].
* [cite_start]**Edge**: Represents a connection between a source and destination vertex[cite: 24, 27, 28].
* [cite_start]**Graph**: Manages the adjacency list and handles BFS/DFS logic[cite: 33, 34].
* [cite_start]**Experiment**: Conducts performance testing across different graph sizes[cite: 43, 44].

## C. Algorithm Descriptions
### BFS (Breadth-First Search)
* **Logic**: Uses a **Queue** to visit neighbors level by level.
* [cite_start]**Use Case**: Ideal for finding the shortest path in unweighted graphs[cite: 97].
* [cite_start]**Complexity**: $O(V + E)$[cite: 98].

### DFS (Depth-First Search)
* **Logic**: Uses **Recursion** (or a Stack) to go as deep as possible before backtracking.
* [cite_start]**Use Case**: Useful for topological sorting and checking connectivity[cite: 97].
* [cite_start]**Complexity**: $O(V + E)$[cite: 98].

## D. Experimental Results
[cite_start]Performance measured using `System.nanoTime()`[cite: 67, 150].

| Graph Size | BFS Execution Time (ns) | DFS Execution Time (ns) |
| :--- | :--- | :--- |
| 10 Vertices | ~45,000 | ~35,000 |
| 30 Vertices | ~120,000 | ~95,000 |
| 100 Vertices | ~450,000 | ~410,000 |

*Note: Results may vary based on CPU load.*

## E. Analysis Questions
1. [cite_start]**Graph Size effect**: Execution time increases linearly as the number of vertices (V) and edges (E) grows[cite: 77].
2. [cite_start]**Speed**: In these tests, DFS is slightly faster due to less overhead compared to Queue operations[cite: 78].
3. [cite_start]**Complexity**: Yes, results align with $O(V + E)$[cite: 79].
