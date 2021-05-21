package com.company.zadanka.task2;

import java.util.*;

public class task2 {
    public static void main(String[] args) {

        List<Integer> list = List.of(
                1, 2, 10, 7, 5, 3, 6, 6, 13, 0
        );
        printPairs(list, 13);
    }

    public static void printPairs(List<Integer> list, int sum) {
        List<Integer> temporaryList = new ArrayList<>();
        List<Pair<Integer, Integer>> pairs = new ArrayList<>();

        for (Integer integer : list) {
            int temp = sum - integer;
            if (temporaryList.contains(temp)) {
                if (temp > integer) {
                    pairs.add(new Pair<>(integer, temp));
                } else
                    pairs.add(new Pair<>(temp, integer));
            }
            temporaryList.add(integer);
        }
        pairs.stream()
                .sorted(Comparator.comparing(Pair::getL))
                .forEach(result -> System.out.print(result.getL() + " " + result.getR() + "\n"));
    }
}
