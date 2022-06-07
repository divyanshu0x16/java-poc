package com.publicis.poc.oops;

public class BookRunner {
    public static void main(String[] args){
        Book artOfProgramming = new Book(123);
        Book marvel = new Book(99);

        /*
        artOfProgramming.setCurrentPage(123);
        marvel.setCurrentPage(99);
        */

        artOfProgramming.readBook();
        marvel.readBook();

        marvel.increaseCurrentPage(100);
        marvel.decreaseCurrentPage(250); //Does no change
        marvel.readBook();

        //System.out.println(artOfProgramming.getCurrentPage());

        /*
        Encapsulation - Change in state of class should be through actions (methods)
        artOfProgramming.currentPage = 123;
        marvel.currentPage = 99;
        */

    }
}
