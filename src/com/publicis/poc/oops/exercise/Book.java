package com.publicis.poc.oops.exercise;

import java.util.ArrayList;

public class Book {

    //State
    private int id;
    private String description;
    private String author;
    private ArrayList<Review> reviews = new ArrayList<>();

    public Book(int id, String description, String author) {
        this.id = id;
        this.description = description;
        this.author = author;
    }

    public void addReview(Review review){
        reviews.add(review);
    }

    public String toString(){
        return String.format("ID - %d, Description - %s, Author - %s\nReviews - %s", id, description, author, reviews);
    }
}
