package com.publicis.poc.basics;

public class MultTable {
    public static void main (String[] args){
        TablePrinter();
    }

    //Method Overloading
    public static void TablePrinter(){
        for (int i = 0; i <= 10; i++){
            System.out.printf("%d * %d = %d", 15, i, 15*i).println();
        }
    }

    public static void TablePrinter(int table){
        for (int i = 0; i <= 10; i++){
            System.out.printf("%d * %d = %d", table, i, table*i).println();
        }
    }
}
