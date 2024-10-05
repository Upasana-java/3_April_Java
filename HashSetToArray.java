package com.assignment2;

import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {
        // Create a HashSet and add some colors
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the original HashSet
        System.out.println("Original HashSet: " + colors);

        // Convert the HashSet to an array
        String[] colorsArray = colors.toArray(new String[0]);

        // Print the array
        System.out.println("Converted Array: ");
        for (String color : colorsArray) {
            System.out.println(color);
        }
    }
}
