package com.company.zadanka.task3;


import com.company.zadanka.task3.QuickUnionOptimized;

public class test3 {

    public static void main(String[] args) {

        QuickUnionOptimized findGraphs = new QuickUnionOptimized(5);

        int[] array = new int[]{1,2,2,3,5,6};

        findGraphs.union(0,1);
        findGraphs.union(1,2);
        findGraphs.union(3,4);


        System.out.println("ilosc grafow: " + findGraphs.count());

    }


}
