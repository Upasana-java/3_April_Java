package com.assignment2;

import java.util.HashSet;

public class CountHashSetElements {
    public static void main(String[] args) {
        // Create a HashSet to store colors
        HashSet<String> colors = new HashSet<>();

        // Add some colors to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Get the number of elements in the HashSet
        int numberOfElements = colors.size();

        // Print the number of elements
        System.out.println("Number of elements in the HashSet: " + numberOfElements);
    }
}
