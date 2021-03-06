*Inactive / useless. This repository is just a relic from the good old days.*


Object-Oriented Data Structures
===============================
 
 NYU Fall 2013
 
I am taking Object-Oriented Data Structures this fall and I have created this repo
to post some of my most interesting assignments (coded in Java).

Each directory contains each data structure's underlying files as well as a
sub-directory named "testing", containing the cases we must design to
ensure the validity of our structures.

===============================

Index:

1. assign2_stacksQueues: 

        a. Linked-list implementation of a stack and a queue. Nodes are created in separate classes, respectively titled "StackListNode.java" and "QueueListNode.java".
        
        b. "BalanceCheck.java" uses the stack to ensure that provided strings are "balanced" (meaning that for every opening character stored in the hash-table within the file there is a closing character).
        

2. assign5_skipLists: 

        a. "SkiplistMap.java" implements a skip-list through put(), get() and remove() methods; calculateStats() and its helper methods provide statistics through which the O(logN) behavior of the data structure is analyzed. New nodes are created through "SkiplistMapNode.java".
        
        b. An iterator, called through the main class's iterator() method, is constructed from "SkiplistMapIterator.java".

3. assign6_graphs:
  
        a. "Graph.java" implements a basic directed graph with nodes and edges both having their own generic type. The public methods are findNode(), addNode(), getNodes(), addEdge() (overloaded), addBiEdge() and toString(). New nodes and edges are created through "Node.java" and "Edge.java".
        
        b. Dijkstra's Algorithm to find the shortest paths from a specified node to the rest of the nodes in a graph is implemented through "DijkstrasAlgorithm.java".

4. assign7_crosswordPuzzles:
  
        a. "CWSolution.java" provides the crossword-puzzle solution generator. A list of plausible words is provided through the constructor and checked against the pattern provided by the public solutions() method.
