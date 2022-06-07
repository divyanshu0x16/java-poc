package com.publicis.poc.oops.interfaceclass;

interface Flyable{
    void fly();
}

class Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("With wings");
    }
}

class Aeroplane implements Flyable{

    @Override
    public void fly() {
        System.out.println("With plane");
    }
}

public class FlyableRunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
        for(Flyable object: flyingObjects){
            object.fly();
        }
    }
}
