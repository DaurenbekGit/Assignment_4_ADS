# Graph Traversal and Representation System

Java implementation of graph traversal algorithms using adjacency list representation.

---

# Project Overview

A graph is a data structure that consists of:
- Vertices (nodes)
- Edges (connections between vertices)

This project implements:
- Breadth-First Search (BFS)
- Depth-First Search (DFS)

The graph is represented using an adjacency list.

---

# Project Structure

```text
assignment4-graphs/
├── src/
│   ├── Vertex.java
│   ├── Edge.java
│   ├── Graph.java
│   ├── Experiment.java
│   └── Main.java
├── docs/
│   └── screenshots/
├── README.md
└── .gitignore
Class Descriptions
Vertex.java

Represents a single vertex in the graph.

Fields
id — unique vertex identifier
Methods
Constructor
getId()
toString()
Edge.java

Represents a connection between two vertices.

Fields
source
destination
Methods
Constructor
Getters
toString()
Graph.java

Represents the graph using an adjacency list.

Main Methods
addVertex(Vertex v)
addEdge(int from, int to)
printGraph()
bfs(int start)
dfs(int start)
Adjacency List Example
0 -> [1, 2]
1 -> [0, 3]
2 -> [0, 4]
3 -> [1, 5]
4 -> [2, 6]

The adjacency list is memory efficient and suitable for sparse graphs.

BFS Algorithm
Breadth-First Search

BFS traverses the graph level by level using a queue.

Steps
Start from a selected vertex
Add it to the queue
Visit all adjacent vertices
Continue until the queue becomes empty
Example BFS Traversal
0 1 2 3 4 5 6
Use Cases
Shortest path
Navigation systems
Social networks
Time Complexity

O(V + E)

Where:

V = number of vertices
E = number of edges
DFS Algorithm
Depth-First Search

DFS traverses the graph deeply before backtracking.

Steps
Start from a selected vertex
Visit one neighbor deeply
Continue until no unvisited neighbors remain
Backtrack and continue traversal
Example DFS Traversal
0 1 3 5 2 4 6
Use Cases
Cycle detection
Maze solving
Tree traversal
Time Complexity

O(V + E)

Experimental Results

Execution time is measured using:

long start = System.nanoTime();
long end = System.nanoTime();
Graph Size	BFS Time	DFS Time
10 Vertices	120000 ns	95000 ns
30 Vertices	210000 ns	180000 ns
100 Vertices	650000 ns	590000 ns
Observations
Execution time increases when graph size increases.
BFS and DFS follow the expected complexity O(V + E).
DFS was slightly faster in some tests.
BFS is useful for shortest path problems.
Graph Output
0 -> [1, 2]
1 -> [0, 3]
2 -> [0, 4]
3 -> [1, 5]
4 -> [2, 6]
5 -> [3]
6 -> [4]
BFS Output
0 1 2 3 4 5 6
DFS Output
0 1 3 5 2 4 6
Reflection

This assignment helped me understand graph traversal algorithms and adjacency list representation.

I learned the differences between BFS and DFS. BFS explores vertices level by level using a queue, while DFS explores deeply using recursion.

One challenge during implementation was understanding traversal order and recursive DFS traversal.

Conclusion

This project demonstrates graph traversal using BFS and DFS in Java with adjacency list representation.

These algorithms are widely used in pathfinding, navigation systems, networking, and graph analysis.
