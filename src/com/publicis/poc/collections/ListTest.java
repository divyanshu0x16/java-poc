package com.publicis.poc.collections;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {

        //List is immutable. ArrayList is a mutable
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        System.out.println(numbers);
        System.out.println(numbers.contains(1));

        /*
                        List
                          |
        ----------------- |-----------------
        |                 |                |
     ArrayList        LinkedList         Vector <--- Stack
        */
        List<Integer> numbersArrayList = new ArrayList<>(numbers);
        List<Integer> numbersLinkedList = new LinkedList<>(numbers);
        List<Integer> numbersVector = new Vector<>(numbers);

        /*
        Vector is thread safe. Synchronized methods. Slower because other threads cannot access
        */

        System.out.println(numbersArrayList);
        System.out.println(numbersLinkedList);
        System.out.println(numbersVector);

        //Operations are same for all
        numbersLinkedList.add(2, 100);
        numbersLinkedList.set(2, 99);


        //Iterating using iterator
        Iterator<Integer> numbersIterator = numbersLinkedList.iterator();
        while(numbersIterator.hasNext()){
            System.out.println(numbersIterator.next());
        }

        for(Integer number: numbers){
            if(number%2 == 0){
                System.out.print(number + " ");
            }
        }

        Collections.sort(numbersLinkedList);
        System.out.println();
        System.out.println(numbersLinkedList);
    }
}
