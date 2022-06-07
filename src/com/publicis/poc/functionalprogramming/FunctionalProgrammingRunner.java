package com.publicis.poc.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Cat", "Dog");
        printWithFP(list);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        numbers.stream().filter(element -> element%2==0).forEach(element -> System.out.println(element));

        int sum = numbers.stream().reduce(0, (number1, number2) -> {
            System.out.println(number1 + " " + number2);
            return number1 + number2;
        });

        numbers.stream().sorted().forEach(e->System.out.println(e));

        System.out.println(sum);

        //Print squares for first 10 numbers
        IntStream.range(1, 10).map(e -> e*e).forEach(p -> System.out.println(p));


        //Terminal Operations
        IntStream.range(1, 11).reduce(0, (n1, n2) -> n1 + n2);
        List.of(23, 12, 34, 53).stream().max((n1, n2) -> Integer.compare(n1, n2));
    }

    private static void printBasic(List<String> list) {
        for (String string: list){
            System.out.println(string);
        }
    }

    private static void printWithFP(List<String> list) {
        list.stream().forEach(
                element -> System.out.println(element)
        );
    }
}
