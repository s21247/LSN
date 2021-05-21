package com.company.zadanka.task1;

import java.util.*;
import java.util.stream.Collectors;


public class task1 {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(
                1, 10, 20, 20, 2, 5
        );

        Set<Integer> sorted = integerList.stream()
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        sorted.stream().distinct()
               .forEach(result -> System.out.print(result + " "));
        System.out.println();
        System.out.println("count: " + integerList.size());

        int distinct = sorted.size();
        System.out.println("distinct: " + distinct);

        int min = sorted.stream()
                .mapToInt(value -> value)
                .min().orElseThrow(NoSuchElementException::new);
        System.out.println("min: " + min);

        int max = sorted.stream()
                .mapToInt(value -> value)
                .max().orElseThrow(NoSuchElementException::new);
        System.out.println("max: " + max);
    }
}
