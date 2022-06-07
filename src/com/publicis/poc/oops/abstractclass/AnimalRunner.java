package com.publicis.poc.oops.abstractclass;

//Polymorphism
abstract class Animal{
    abstract void bark();
}

class Dog extends Animal {
    public void bark(){
        System.out.println("Bhow Bhow");
    }
}

class Cat extends Animal {

    @Override
    void bark() {
        System.out.println("Meow");
    }
}

public class AnimalRunner {

    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog()};

        //We call the same reference variable and same reference method, but we have different behaviours
        for(Animal animal: animals){
            animal.bark();
        }
    }
}
