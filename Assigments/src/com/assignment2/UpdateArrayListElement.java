package com.assignment2;

import java.util.ArrayList;

public class UpdateArrayListElement {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print original ArrayList
        System.out.println("Original ArrayList: " + colors);

        // Update the element at index 1 (Green -> Orange)
        colors.set(1, "Orange"); // Update the color at index 1

        // Print the updated ArrayList
        System.out.println("Updated ArrayList: " + colors);
    }
}
