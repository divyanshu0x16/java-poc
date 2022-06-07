package com.publicis.poc.collections;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class SetInterface {
    public static void main(String[] args) {

        //neither provides sorted order or insertion order
        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i <= 25; i++){
            numbers.add(i);
        }

        //System.out.println(numbers);

        //Maintains insertion order
        Set<Integer> numbersLinked = new LinkedHashSet<>();

        for (int i = 0; i <= 25; i++){
            numbersLinked.add(i);
        }

        numbersLinked.add(12);

        //System.out.println(numbersLinked);

        //Maintains sorted order
        Set<Integer> numbersTree = new TreeSet<>();

        for (int i = 0; i <= 25; i++){
            numbersTree.add(i);
        }

        numbersLinked.add(12);

        //System.out.println(numbersTree);

        ArrayList<Character> characters = new ArrayList<Character>(Arrays.asList('A', 'Z', 'A', 'B', 'Z', 'F', 'C', 'D'));
        Set<Character> charSet = new TreeSet<>(characters);
        Set<Character> charLinkedSet = new LinkedHashSet<>(characters);
        System.out.println(charSet);
        System.out.println(charLinkedSet);


        TreeSet<Integer> numbersTreeSet = new TreeSet<>(Set.of(65,54,34,12,99));
        System.out.println(numbersTreeSet.floor(40));
    }
}
