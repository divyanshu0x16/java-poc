package com.publicis.poc.arrays;

import java.util.ArrayList;

public class ArrayListTest {
//    public static void main(String[] args) {
//        int [] marks = {1, 2, 3, 4, 5};
//
//        System.out.println(Arrays.toString(marks));
//    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Apple");
        arrayList.add("Bat");
        arrayList.add("Cat");

        System.out.println(arrayList);

        arrayList.remove("Cat");

        System.out.println(arrayList);
    }
}
