package com.publicis.poc.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashTest {
    public static void main(String[] args) {
        //Hashmap is unsorted and unordered. Allows a null value
        //HashTable is synchronized

        Map<String, Integer> map = Map.of("A", 3, "B", 5, "Z", 10);

        //System.out.println(map.get("C")); //Will return null
        //System.out.println(map.keySet());

        Map<String, Integer> hashmap = new HashMap<>(map);

        hashmap.put("F", 5);
        //System.out.println(hashmap.get("F"));

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Z", 5);
        hashMap.put("A", 15);
        hashMap.put("F", 25);
        System.out.println(hashMap);

        //Insertion order is maintained
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Z", 5);
        linkedHashMap.put("A", 15);
        linkedHashMap.put("F", 25);
        System.out.println(linkedHashMap);

        //Sorted Order
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Z", 5);
        treeMap.put("A", 15);
        treeMap.put("F", 25);
        System.out.println(treeMap);

        //Exercise
        String given = "This is a great great thing";
        HashMap<String, Integer> wordFreq = new HashMap<>();
        for (String word : given.split(" ")){
            wordFreq.merge(word, 1, Integer::sum);
        }

        HashMap<Character, Integer> letterFreq = new HashMap<>();
        for (Character c : given.toCharArray()){
            letterFreq.merge(c, 1, Integer::sum);
        }

        System.out.println(wordFreq);
        System.out.println(letterFreq);

        //Treemap
        treeMap.put("L", 250);
        treeMap.put("G", 25);
        treeMap.put("X", 123);
        System.out.println(treeMap);

        System.out.println(treeMap.higherKey("B"));
        System.out.println(treeMap.subMap("B", true, "Z", false));
    }
}
