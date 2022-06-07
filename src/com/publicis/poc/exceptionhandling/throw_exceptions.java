package com.publicis.poc.exceptionhandling;

import java.util.Scanner;

public class throw_exceptions {

    public static void ex(int a, int b) {
        if(a!=b)
            throw new RuntimeException("a is not equal to b");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            ex(a, b);
        } catch (RuntimeException e) {
            System.out.println("Exception is : "+e);
        }

    }
}