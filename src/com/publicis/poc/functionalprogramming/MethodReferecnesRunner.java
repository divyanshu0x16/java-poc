package com.publicis.poc.functionalprogramming;

import java.util.List;

public class MethodReferecnesRunner {

    public  static void print(Integer number){
        System.out.println(number);
    }

    public static void main(String[] args) {
        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length).forEach(MethodReferecnesRunner::print);

        Integer max = List.of(23, 45, 67, 34).stream().filter(MethodReferecnesRunner::isEven).max(Integer::compare).orElse(0);
        System.out.println(max);
    }

    public static boolean isEven(Integer number){
        return number%2==0;
    }
}
