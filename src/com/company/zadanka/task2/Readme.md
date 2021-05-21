### Task2
Again, the input is a long list of integers. Provide a working code that will find all the pairs (in this integer list) that sum up to 13. 
Each pair in the output should have first number not greater than the second one and lines should be sorted in an ascending order.

Sample:

For the input:

```
1 2 10 7 5 3 6 6 13 0

```

expected output is:

```
0 13
3 10
6 7
6 7
```

## About program
Program has been written in java 11 without gradle or maven
I took the idea how to find pairs that sum up to 13 from
geeksforgeeks. I decided to use Class Pair so i can store
pairs easier and also it helped me to sort pairs in the end
I believe program can be optimized in a simple way just
need to delete temporaryList and find better solution to check
if the list contains number.

## Resources
https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
https://docs.oracle.com/javase/9/docs/api/javafx/util/Pair.html
