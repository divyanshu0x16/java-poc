package com.publicis.poc.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import  java.util.List;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value1.length(), value2.length());
    }
}

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        System.out.println(queue.poll()); //returns head

        queue.addAll(List.of(1, 123, 45, 567, 90));

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        //Custom order

    }
}
