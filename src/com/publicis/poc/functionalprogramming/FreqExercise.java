package com.publicis.poc.functionalprogramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        /*
        collect() is used to repackage elements to some data structures and applying some additional logic on data elements, like Collectors.toList()
        It is a terminal operation.

        Collectors.groupingBy() similar to 'GROUP BY' in SQL. In this we are grouping by 'value' of String
        Collectors.counting() method returns a collector accepting the elements of Type T, and counts the number of input elements.

        entrySet() converts mapping to set, so we can sort it in descending order
        */
        Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting() )).
                entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).limit(3).forEach(System.out::println);


    }
}
