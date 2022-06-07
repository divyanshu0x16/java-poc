package com.publicis.poc.oops;

public class Rectangle {

    //state
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    //Getters and Setters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area() {
        return length * width;
    }

    public int perimeter(){
        return 2 * (length + width);
    }

    public String toString(){
        return String.format("Length - %d, Width - %d, Area - %d, Perimeter - %d", length, width, area(), perimeter());
    }
}
