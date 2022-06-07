package com.publicis.poc.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            int[] numbers = {12, 3, 4, 5};
            int number = numbers[5];
            //Scanner is not closed
            //scanner.close();
        } catch (Exception e){
            e.printStackTrace();
        } finally { //Code in finally is always executed
            System.out.println("Before Scanner CLose");
            if(scanner != null)
                scanner.close();
        }

        System.out.println("Just before closing main");
    }
}
