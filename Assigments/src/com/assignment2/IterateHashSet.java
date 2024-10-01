package com.assignment2;

import java.util.HashSet;

public class IterateHashSet {
    public static void main(String[] args) {
        // Create a HashSet to store colors
        HashSet<String> colors = new HashSet<>();

        // Add some colors to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the HashSet
        System.out.println("HashSet: " + colors);

        // Iterate through the HashSet using a for-each loop
        System.out.println("Iterating through the HashSet:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
