package com.assignment2;

import java.util.ArrayList;

public class InsertAtFirstPosition {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Insert a color at the first position
        colors.add(0, "Yellow"); // Adding Yellow at index 0 (first position)

        // Print out the updated ArrayList
        System.out.println("ArrayList after inserting element at the first position: " + colors);
    }
}
