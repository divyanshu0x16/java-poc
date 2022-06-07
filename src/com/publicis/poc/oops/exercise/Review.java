package com.publicis.poc.oops.exercise;

public class Review {
    private int id;
    private String description;
    private double rating;

    public Review(int id, String description, double rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    public String toString(){
        return String.format("Review ID - %d, Description - %s, Rating - %f", id, description, rating);
    }
}
