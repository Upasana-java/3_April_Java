package com.assignment2;

import java.util.ArrayList;

public class ReplaceSecondElement {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + colors);

        // Replace the second element (index 1)
        String newColor = "Orange";
        colors.set(1, newColor);

        // Print the updated ArrayList
        System.out.println("ArrayList after replacing the second element: " + colors);
    }
}
