### Task3
The first line of input contains a positive number `n`, next `n` lines contains pairs of positive integers, where each pair identifies
a connection between two vertices in a graph. Please provide a working code that will give us the answer for the following questions:
how many separated graphs are in the input.

Sample: 

For the input:

```
3
1 2
2 3
5 6
```

expected output is:

```
2
```

## About program
Program has been written in java 11 without maven or gradle
After research i found QuickUnion and UnionFind algorithms
which are very helpful for graphs but they were kinda slow
so i implemented WeightedQuickUnionPathCompressionUF 
which big O notation is O(logn)
Unfortunately i couldn't come up with best solution for the input.
But my program is taking indexes and fill them in an array.
It's only working when indexes are going from 0 to n-1 otherwise
there will be an exception IllegalArgumentException and if
n is bigger than necessary then graph count won't give expected output
but it's very fast solution and the best i could come up with at the moment.

## About algorithm
Quick Union:
disjoint-set is a data structure that keeps track of a set of elements partitioned into a number of disjoint (non-overlapping) subsets.
A Union-Find algorithm is an algorithm that performs two useful operations on such a data structure:
Find: Determine which subset a particular elements is in. This can be used for determining if two elements are in the same subset.
Union: Join two subsets into a single subset.
And Quick Union is one of the implementations of Union-Find algorithm. And it’s an algorithm for solving the dynamic connectivity problem, also called lazy approach.

Weightening:
The idea is to when implementing the quick union algorithm take steps to avoid having tall trees
always making sure that we link the root of the smaller tree to the root of the larger tree
Path compression:
this idea is that, when we're trying to find the root of the tree containing a, a given node. We're touching all the nodes on the path from that node to the root.

## Resources 
https://www.cs.princeton.edu/~rs/AlgsDS07/01UnionFind.pdf
https://algs4.cs.princeton.edu/15uf/WeightedQuickUnionPathCompressionUF.java.html
https://www.coursera.org/learn/algorithms-part1
https://www.baeldung.com/java-graphs

Have a good day,
Greetings Wojtek.
