package com.publicis.poc.exceptionhandling;

public class ExceptionHandlingRunner2 {
    public static void main(String[] args) {
        method1();
        System.out.println("Main Ended");
    }

    private static void method1() {
        method2();
        System.out.println("Method1 Ended");
    }

    private static void method2() {
        try {
            //If exception is not handled it is handled to the caller thread

            //String str = null;
            //str.length();

            int[] i = {1, 2};
            int number = i[3];

            System.out.println("Method2 Ended");
        } catch (NullPointerException exception){
            System.out.println("Matched NullPointerException");
            exception.printStackTrace();
        } catch (Exception exception){
            System.out.println("Matched Exception");
            exception.printStackTrace();
        }
    }
}
