# CSE 017 - Homework 5

Implement the following classes. You can add any additional classes, fields, or methods you deem necessary to complete this assignment.

## Stack.java

Implement a stack datastructure as a class with the following fields and methods:

```java
Fields: 
- int[] list          // fixed size array that holds items of the stack
- int top             // index of the top of the stack
- int capacity        // how many items can the stack hold
- int size            // how many items are currently on the stack
Methods:
+ Stack(int capacity) // 1-arg constructor with initial capacity
+ int pop()           // return the top of the stack
+ void push(int item) // add item to the top of the stack
+ int peek()          // return the item at the top of the stack without removing it
```


## Queue.java

Implement a [circular queue](https://en.wikipedia.org/wiki/Circular_buffer) datastructure as a class with the following fields and methods:

```java
Fields: 
- int[][] G           // fixed size array that holds items of queue
- int front           // index of front of the queue
- int back            // index of the back of the queue
- int capacity        // how many items can the queue hold
- int size            // how many items are currently on the queue
Methods:
+ Queue(int capacity) // 1-arg constructor with initial capacity
+ int pop()           // return the front of the queue
+ void push(int item) // add item to the back of the queue
+ int peek()          // return the item at the front of the queue without removing it
```

## Graph.java

Implement a graph datastructure as a class with the following fields and methods. Assume the graph nodes are labeled corresponding to their row/column placement in the adjacency matrix (e.g. Node 3 is row 3/ column 3).

```java
Fields: 
- int[][] graph                      // adjacency matrix representing the graph
Methods:
+ Graph(int[][] graph)               // 1-arg constructor with initial graph
+ void add_edge(int from, int to)    // add an edge between node "from" and node "to"
+ void remove_edge(int from, int to) // remove an edge between node "from" and node "to"
+ int[] traverse_bfs(int start)      // use the stack you implemented to write a breadth first search traversal over the graph. Returns an array with the nodes in order of traversal. Start indicates the starting node
+ int[] traverse_dfs(int start)      // use the queue you implemented to write a depth first search traversal over the graph. Returns an array with the nodes in order of traversal. Start indicates the starting node.
```
