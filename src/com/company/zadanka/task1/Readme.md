## Task1
The input is a long list of integers. Please write a small app that will output the list of distinct elements sorted in ascending order,
plus the basic measurement information that contains the number of elements in the source, number of distinct elements, min and max value.

Sample:

For the input:
```
1 10 20 20 2 5
```
expected output is:
```
1 2 5 10 20
count: 6
distinct: 5
min: 1
max: 20
```
## About the program
Program had been written in java 11 without gradle or maven
Program is first sorting list of inputs and collecting it to another
set. I am not entirely sure if linkedhashset was the best choice,
but i ended up sticking with it. Later on is just simple streams API
features like distinct,min,max.

