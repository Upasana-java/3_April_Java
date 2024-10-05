package com.assignment2;

import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {
        // Create a HashSet to store colors
        HashSet<String> colors = new HashSet<>();

        // Add some colors to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Print the original HashSet
        System.out.println("Original HashSet: " + colors);

        // Specify the element to append
        String newColor = "Yellow";

        // Append the specified element to the HashSet
        colors.add(newColor); // HashSet does not maintain order, so it will be added

        // Print the updated HashSet
        System.out.println("HashSet after appending " + newColor + ": " + colors);
    }
}
