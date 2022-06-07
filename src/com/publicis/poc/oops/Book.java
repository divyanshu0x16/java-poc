package com.publicis.poc.oops;

public class Book{
    //state
    private int currentPage; //member variable
    //default initialize is zero

    //To provide a default value
    Book(){ // np argument constructor
        this(1); //Calling other constructor from this one
    }

    Book(int currentPage) {
        this.currentPage = currentPage;
    }

    //behaviour
    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        if(currentPage > 0)
            this.currentPage = currentPage;
    }

    public void increaseCurrentPage(int howMuch){
        setCurrentPage(this.currentPage + howMuch);
    }
    public void decreaseCurrentPage(int howMuch){
        setCurrentPage(this.currentPage - howMuch);
    }
    void readBook(){
        System.out.printf("Reading page %d", currentPage).println();
    }
}
