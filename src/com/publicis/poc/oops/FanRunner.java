package com.publicis.poc.oops;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Man1", 1.34, "Black");
        fan.switchOn();
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}
