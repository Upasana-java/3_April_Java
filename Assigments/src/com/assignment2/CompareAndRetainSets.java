package com.assignment2;

import java.util.HashSet;

public class CompareAndRetainSets {
    public static void main(String[] args) {
        // Create the first HashSet
        HashSet<String> set1 = new HashSet<>();
        set1.add("Red");
        set1.add("Green");
        set1.add("Blue");
        set1.add("Yellow");

        // Create the second HashSet
        HashSet<String> set2 = new HashSet<>();
        set2.add("Blue");
        set2.add("Yellow");
        set2.add("Purple");

        // Print the original HashSets
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Retain only the elements that are the same in both sets
        set1.retainAll(set2);

        // Print the retained elements
        System.out.println("Elements common to both sets: " + set1);
    }
}
